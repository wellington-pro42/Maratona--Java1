package academy.devdojo.maratonajava.javacore.Atividades.Test01;

import academy.devdojo.maratonajava.javacore.Atividades.dominio.Produto;

public class produtoTest01 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 19.85, 10 );
        Produto produto2 = new Produto("Cafe", 15.52, 3);
        Produto produto3 = new Produto("Farofa", 3.99, 2);


        produto1.imprime();
        produto2.imprime();
        produto3.imprime();




    }

}
