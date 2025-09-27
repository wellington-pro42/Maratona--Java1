package academy.devdojo.maratonajava.introducao.Atividadefacul.Test;

import academy.devdojo.maratonajava.introducao.Atividadefacul.dominio.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto(54, "Camisa", 55, 154);
        Produto produto2 = new Produto(87, "Quadro", 450, 10);
        Produto produto3 = new Produto(120, "Blusa", 150, 20);

        produto1.reajustarProduto();
        produto2.reajustarProduto();
        produto3.reajustarProduto();

        produto1.imprime();
        produto2.imprime();
        produto3.imprime();



    }
}
