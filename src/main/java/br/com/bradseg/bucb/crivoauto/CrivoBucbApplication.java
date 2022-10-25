package br.com.bradseg.bucb.crivoauto;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.bradseg.bucb.crivoauto.exception.BUCBCrivoException_Exception;
import br.com.bradseg.bucb.crivoauto.po.ExecutaOperacaoCrivoPO;
import br.com.bradseg.bucb.crivoauto.po.Operacao;
import br.com.bradseg.bucb.crivoauto.service.response.ServiceConecao;

@SpringBootApplication
public class CrivoBucbApplication {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws BUCBCrivoException_Exception {
        SpringApplication.run(CrivoBucbApplication.class, args);
        System.out.println("Conectado..");
       
        System.out.println("Digite seu cpf :");

        String cpf = teclado.nextLine();

         Operacao operacaoCrivo = new Operacao();
        ExecutaOperacaoCrivoPO operacao = operacaoCrivo.operaca(cpf);

        ServiceConecao service = new ServiceConecao();
        List<String> conexao = service.conexao(operacao);

        // RESULTADO
        conexao.stream().forEach(System.out::print);
    }
}
