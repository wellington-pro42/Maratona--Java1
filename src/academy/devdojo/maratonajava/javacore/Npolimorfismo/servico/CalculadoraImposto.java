package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {


        public static void calcularimposto(Produto produto){
        System.out.println("Relatorio de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("produto " + produto.getNome());
        System.out.println("valor " + produto.getValor());
        System.out.println("imposto a ser pago " + imposto);

        if (produto instanceof Tomate){
        Tomate tomate = (Tomate) produto;
        System.out.println(tomate.getDataValidade());
        }




        }


    }



