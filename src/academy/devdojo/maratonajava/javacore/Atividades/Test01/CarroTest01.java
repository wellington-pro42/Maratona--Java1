package academy.devdojo.maratonajava.javacore.Atividades.Test01;

import academy.devdojo.maratonajava.javacore.Atividades.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Fiat", "UNO", 2005);
        Carro carro2 = new Carro("Fiat", "Palio", 2015);
        Carro carro3 = new Carro("Toyota", "Corolla", 2025);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
        carro3.exibirDetalhes();


    }
}
