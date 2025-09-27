package academy.devdojo.maratonajava.javacore.Atividade2.dominio;

public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + valor +  " realizado no boleto bancario");

    }

}
