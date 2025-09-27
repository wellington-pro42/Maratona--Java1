package academy.devdojo.maratonajava.introducao.Atividadefacul.dominio;

public class Pix extends MetodoPagamento {
    public Pix(double valor, String nome) {
        super(valor, nome);
    }

    @Override
    public double calculartaxa() {
        return getValor() * 0.01;
    }
}
