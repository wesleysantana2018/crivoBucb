package br.com.bradseg.bucb.crivoauto.po;

import br.com.bradseg.bucb.crivoauto.vo.ParametroEntradaVO;
import br.com.bradseg.bucb.crivoauto.vo.ParametroSaidaVO;

public class Operacao {

    public ExecutaOperacaoCrivoPO operaca(String cpf) {

        ExecutaOperacaoCrivoPO operacaoCrivoPO = new ExecutaOperacaoCrivoPO();

        operacaoCrivoPO.setLogin("webservice_auto");
        operacaoCrivoPO.setPolitica("(AUTOPREENCHIMENTO)_POLITICA_PF");
        operacaoCrivoPO.setSenha("crivo");
        operacaoCrivoPO.setTipoPessoa("PF");

        ParametroEntradaVO entradaVO = new ParametroEntradaVO();
        entradaVO.setNome("CPF");
        entradaVO.setValor(cpf);
        operacaoCrivoPO.getParametrosEntrada().add(0, entradaVO);

        ParametroSaidaVO saidaVO = new ParametroSaidaVO();
        saidaVO.setNome("DATA_NASCIMENTO");
        operacaoCrivoPO.getRetornoDesejado().add(0, saidaVO);

        ParametroSaidaVO saidaVO1 = new ParametroSaidaVO();
        saidaVO1.setNome("NOME");
        operacaoCrivoPO.getRetornoDesejado().add(1, saidaVO1);

        ParametroSaidaVO saidaVO2 = new ParametroSaidaVO();
        saidaVO2.setNome("SEXO");
        operacaoCrivoPO.getRetornoDesejado().add(2, saidaVO2);

        ParametroSaidaVO saidaVO3 = new ParametroSaidaVO();
        saidaVO3.setNome("NOME_MAE");
        operacaoCrivoPO.getRetornoDesejado().add(3, saidaVO3);

        return operacaoCrivoPO;
    }

}
