package br.com.bradseg.bucb.crivoauto.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bradseg.bucb.crivoauto.exception.BUCBCrivoException_Exception;
import br.com.bradseg.bucb.crivoauto.po.ExecutaOperacaoCrivoPO;
import br.com.bradseg.bucb.crivoauto.po.Operacao;
import br.com.bradseg.bucb.crivoauto.service.response.ServiceConecao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/crivo")
public class ResourceCrivoPessoaFisica {

    Operacao operacaoCrivo = new Operacao();
    ServiceConecao service = new ServiceConecao();

    @GetMapping("/recuperarPessoaFisica/{cpf}")
    public ResponseEntity<List<String>> recuperarPessoaFisica(@PathVariable String cpf)
            throws BUCBCrivoException_Exception {
        log.debug("Recuperar pessoa fisica resource - cpf: {}", cpf);

        ExecutaOperacaoCrivoPO operacao = operacaoCrivo.operaca(cpf);
        List<String> conexao = service.conexao(operacao);
        return ResponseEntity.status(HttpStatus.OK).body(conexao);
    }

}
