package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro(" palio ", 280);
        Carro carro2 = new Carro("corsa", 200 );
        Carro carro3 = new Carro("uno", 299 );
        Carro carro4 = new Carro("POLO", 120);


        Carro.setVelocidadeLimite(190);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
        carro4.imprime();



    }
}
