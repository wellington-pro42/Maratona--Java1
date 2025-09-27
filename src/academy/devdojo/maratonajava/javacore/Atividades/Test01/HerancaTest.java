package academy.devdojo.maratonajava.javacore.Atividades.Test01;

import academy.devdojo.maratonajava.javacore.Atividades.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Atividades.dominio.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Wellington", 25);
        Pessoa pessoa2 = new Pessoa();


        pessoa2.setNome("Maria");
        pessoa2.setIdade(24);
        pessoa2.imprime();


        pessoa.imprime();

        Aluno aluno = new Aluno("15115151515", "Fabiana", 15);
        aluno.imprime();


    }
}
