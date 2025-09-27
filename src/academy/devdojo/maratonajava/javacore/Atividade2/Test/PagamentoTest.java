package academy.devdojo.maratonajava.javacore.Atividade2.Test;

import academy.devdojo.maratonajava.javacore.Atividade2.dominio.*;

public class PagamentoTest {
    public static void main(String[] args) {
        PagamentoCartao cartao = new PagamentoCartao(580);
        PagamentoBoleto boleto = new PagamentoBoleto(123);



        cartao.processarPagamento();
        cartao.ImprimirRecibo();
        System.out.println("=======");
        boleto.processarPagamento();
        boleto.ImprimirRecibo();

        System.out.println("=======");

        double valor = 100;
        System.out.println("Desconto crédito: " + TipoPagamento.CREDITO.calcularDesconto(valor));
        System.out.println("Desconto boleto: " + TipoPagamento.BOLETO.calcularDesconto(valor));
    }
}
