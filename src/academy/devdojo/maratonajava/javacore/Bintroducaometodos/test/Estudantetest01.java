package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class Estudantetest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Wellington";
        estudante1.sexo = 'm';
        estudante1.idade = 10;

        estudante2.nome = "Paola";
        estudante2.sexo = 'f';
        estudante2.idade = 35;


        impressora.imprime(estudante1);

        impressora.imprime(estudante2);

    }
}
