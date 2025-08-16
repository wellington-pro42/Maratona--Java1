package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Livro;

public class Livrotest01 {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.autor = " wellington ";
        livro1.preco = 55 ;
        livro1.titulo = " A culpa é das estrelas " ;
       livro1.exibirDetalhes();

    }
}
