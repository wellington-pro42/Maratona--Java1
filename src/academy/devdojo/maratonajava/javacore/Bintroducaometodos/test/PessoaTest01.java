package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Wellington");
        pessoa1.setIdade(22);
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        //pessoa1.imprime();

    }
}
