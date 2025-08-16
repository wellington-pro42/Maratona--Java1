package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class Carrotest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.nome = "gol";
        carro1.ano = 2002;
        carro1.modelo = "volkswagen";

        System.out.println(carro1.nome);
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);

        System.out.println("\n-----------------------------------");

        Carro carro2 = new Carro();

        carro2.nome = "palio";
        carro2.ano = 2000;
        carro2.modelo = "fiat";

        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);


    }
}
