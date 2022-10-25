package br.com.bradseg.bucb.crivoauto.service.response;

import java.util.List;

import br.com.bradseg.bucb.crivoauto.delegate.CrivoServiceDelegate;
import br.com.bradseg.bucb.crivoauto.exception.BUCBCrivoException_Exception;
import br.com.bradseg.bucb.crivoauto.po.ExecutaOperacaoCrivoPO;

public class ServiceConecao {

    public List<String> conexao(ExecutaOperacaoCrivoPO opeacaoCrivoPO) throws BUCBCrivoException_Exception {
        CrivoService crivoService = new CrivoService();
        CrivoServiceDelegate crivoServicePort = crivoService.getCrivoServicePort();
        List<String> resultado = crivoServicePort.executaOperacaoObjAnaliseAuto(opeacaoCrivoPO);
        return resultado;
    }

}
