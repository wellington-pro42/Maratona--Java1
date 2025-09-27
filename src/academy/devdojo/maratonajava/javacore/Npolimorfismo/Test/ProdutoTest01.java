package academy.devdojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisão;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("ASUST54", 5400);
        Tomate tomate = new Tomate("Italiano", 10);
        Televisão tv = new Televisão("Samsung 80\" ", 5000);

        CalculadoraImposto.calcularimposto(tv);
        System.out.println("=========");

        CalculadoraImposto.calcularimposto(computador);
        System.out.println("=========");
        CalculadoraImposto.calcularimposto(tomate);

    }
}
