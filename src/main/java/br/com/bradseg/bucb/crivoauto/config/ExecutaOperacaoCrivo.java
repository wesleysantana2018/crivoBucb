package br.com.bradseg.bucb.crivoauto.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.com.bradseg.bucb.crivoauto.po.ExecutaOperacaoCrivoPO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableWebMvc
public class ExecutaOperacaoCrivo implements WebMvcConfigurer {

    // OPERACAO CRIVO
    public ExecutaOperacaoCrivoPO opeacaoCrivoPO() {
        final ExecutaOperacaoCrivoPO operacaoCrivoPO = new ExecutaOperacaoCrivoPO();

        operacaoCrivoPO.setLogin("webservice_auto");
        operacaoCrivoPO.setPolitica("(AUTOPREENCHIMENTO)_POLITICA_PF");
        operacaoCrivoPO.setSenha("crivo");
        operacaoCrivoPO.setTipoPessoa("PF");

        return operacaoCrivoPO;
    }
}
