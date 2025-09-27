package academy.devdojo.maratonajava.introducao.Atividadefacul.Test;

import academy.devdojo.maratonajava.introducao.Atividadefacul.dominio.CalculadoraTaxa;
import academy.devdojo.maratonajava.introducao.Atividadefacul.dominio.CartaoCredito;
import academy.devdojo.maratonajava.introducao.Atividadefacul.dominio.MetodoPagamento;
import academy.devdojo.maratonajava.introducao.Atividadefacul.dominio.Pix;

public class PagamentoTest {
    public static void main(String[] args) {
        MetodoPagamento cartao = new CartaoCredito(500 , "Cartão Mastercard");
        MetodoPagamento pix = new Pix(5000, "pix");

        CalculadoraTaxa.calcular(cartao);
        CalculadoraTaxa.calcular(pix);
    }

}
