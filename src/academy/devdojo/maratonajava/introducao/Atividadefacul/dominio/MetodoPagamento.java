package academy.devdojo.maratonajava.introducao.Atividadefacul.dominio;

public abstract class MetodoPagamento {
    private double valor;
    protected String nome;

    public MetodoPagamento(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public abstract double calculartaxa();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
