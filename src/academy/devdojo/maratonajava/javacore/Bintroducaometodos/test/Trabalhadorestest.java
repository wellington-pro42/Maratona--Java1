package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraTrabalhadores;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Trabalhadores;

public class Trabalhadorestest {
    public static void main(String[] args) {

        Trabalhadores trabalhador1 = new Trabalhadores();
        Trabalhadores trabalhador2 = new Trabalhadores();

        ImpressoraTrabalhadores impressora = new ImpressoraTrabalhadores();

        trabalhador1.idade = 20;
        trabalhador1.nome = "Wellington";
        trabalhador1.sexo = 'm';

        trabalhador2.idade = 30;
        trabalhador2.nome = "Luana";
        trabalhador2.sexo = 'f';

        impressora.imprime(trabalhador1);
        impressora.imprime(trabalhador2);
    }
}
