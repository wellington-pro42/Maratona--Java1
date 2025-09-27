package academy.devdojo.maratonajava.javacore.Atividade2.dominio;

public class PagamentoCartao extends Pagamento {

    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" +  valor + " realizado com cartao de credito");

    }

}