package br.com.bradseg.bucb.crivoauto.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.bradseg.bucb.crivoauto.comum.MessageConstants;
import br.com.bradseg.bucb.crivoauto.comum.NlsUtil;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private final ResponseMessage msgErroValidacao;
    private final ResponseMessage msgOk;
    private final ResponseMessage msgRecursoCriado;
    private final ResponseMessage msgRecursoJaExistente;
    private final ResponseMessage msgNaoEncontrado;
    private final ResponseMessage msgServicoIndisponivel;
    private final ResponseMessage msgSemConteudo;
    private final BuildProperties buildProperties;

    private final NlsUtil nlsUtil;

    @Autowired
    public SwaggerConfig(NlsUtil nlsUtil, BuildProperties buildProperties) {
        this.buildProperties = buildProperties;
        this.nlsUtil = nlsUtil;
        msgErroValidacao = criarResponseMessage(HttpStatus.BAD_REQUEST, MessageConstants.ERRO_VALIDACAO);
        msgOk = criarResponseMessage(HttpStatus.OK, "OK");
        msgRecursoCriado = criarResponseMessage(HttpStatus.CREATED, MessageConstants.RECURSO_CRIADO);
        msgRecursoJaExistente = criarResponseMessage(HttpStatus.CONFLICT, MessageConstants.RECURSO_EXISTENTE);
        msgNaoEncontrado = criarResponseMessage(HttpStatus.NOT_FOUND, MessageConstants.RECURSO_NAO_ENCONTRADO);
        msgServicoIndisponivel = criarResponseMessage(HttpStatus.SERVICE_UNAVAILABLE,
                MessageConstants.SERVICO_INDISPONIVEL);
        msgSemConteudo = criarResponseMessage(HttpStatus.NO_CONTENT, MessageConstants.SEM_CONTEUDO);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("br.com.bradseg.bucb.crivoauto")).paths(PathSelectors.any())
                .build().apiInfo(apiInfo()).useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.GET, getResponseMessageRequestGet())
                .globalResponseMessage(RequestMethod.POST, getResponseMessageRequestPost())
                .globalResponseMessage(RequestMethod.PUT, getResponseMessageRequestPutPatchDelete())
                .globalResponseMessage(RequestMethod.PATCH, getResponseMessageRequestPutPatchDelete())
                .globalResponseMessage(RequestMethod.DELETE, getResponseMessageRequestPutPatchDelete());
    }

    private ApiInfo apiInfo() {
        String version = getApiVersion();
        return new ApiInfoBuilder().title(buildProperties.getName()).version(version).build();
    }

    private String getApiVersion() {
        String version = buildProperties.getVersion();
        if (version.contains("SNAPSHOT")) {
            version = version.replace("SNAPSHOT", buildProperties.getTime().toString());
        }
        return version;
    }

    private ResponseMessage criarResponseMessage(HttpStatus httpStatus, String mensagem) {
        return new ResponseMessageBuilder().code(httpStatus.value()).message(nlsUtil.getMensagem(mensagem)).build();
    }

    private List<ResponseMessage> getResponseMessageRequestGet() {
        ArrayList<ResponseMessage> list = new ArrayList<>();
        list.add(msgErroValidacao);
        list.add(msgOk);
        list.add(msgNaoEncontrado);
        list.add(msgServicoIndisponivel);
        return list;
    }

    private List<ResponseMessage> getResponseMessageRequestPost() {
        ArrayList<ResponseMessage> list = new ArrayList<>();
        list.add(msgErroValidacao);
        list.add(msgRecursoCriado);
        list.add(msgRecursoJaExistente);
        list.add(msgServicoIndisponivel);
        return list;
    }

    private List<ResponseMessage> getResponseMessageRequestPutPatchDelete() {
        ArrayList<ResponseMessage> list = new ArrayList<>();
        list.add(msgErroValidacao);
        list.add(msgSemConteudo);
        list.add(msgNaoEncontrado);
        list.add(msgServicoIndisponivel);
        return list;
    }
}
