package academy.devdojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("SamsungFW2", 2000 );


        Tomate tomate = new Tomate("comum", 8 );
        tomate.setDataValidade("27/09/2025");

        CalculadoraImposto.calcularimposto(tomate);
        System.out.println("=====");
        CalculadoraImposto.calcularimposto(produto);






    }
}
