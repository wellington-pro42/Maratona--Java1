package academy.devdojo.maratonajava.introducao.Atividadefacul.dominio;

public class CartaoCredito extends MetodoPagamento {

    public CartaoCredito(double valor, String nome) {
        super(valor, nome);
    }

    @Override
    public double calculartaxa() {
        return getValor() * 0.05;
    }

}
