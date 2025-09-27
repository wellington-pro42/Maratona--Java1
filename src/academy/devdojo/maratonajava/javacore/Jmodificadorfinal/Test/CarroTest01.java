package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.Test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();


        System.out.println("velocidade: " + Carro.VELOCIDADE_LIMITE);
        carro.comprador.setNome("Wellington");
        System.out.println(carro.comprador);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("nome: Enzo" );
        ferrari.imprime();

    }
}
