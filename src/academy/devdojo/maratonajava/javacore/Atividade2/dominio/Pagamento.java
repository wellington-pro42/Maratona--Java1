package academy.devdojo.maratonajava.javacore.Atividade2.dominio;

public abstract class Pagamento {
    double valor;


    public Pagamento(double valor) {
        this.valor = valor;

    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "valor=" + valor +
                '}';
    }

    public abstract void processarPagamento();

    public void ImprimirRecibo() {
        System.out.println("Recibo de " + valor + " realizado com sucesso");


    }

}
