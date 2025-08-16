package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Autor;

public class Autortest01 {
    public static void main(String[] args) {
        Autor autor1 = new Autor();
        autor1.autor = "wellington";
        autor1.idade = 22;
        autor1.nacionalidade = "brasileiro";


       Autor autor2 = new Autor();
       autor2.autor = " fabiana ";
       autor2.idade = 20;
       autor2.nacionalidade = "argentina";

        autor1.exibirDetalhes();
       autor2.exibirDetalhes();




    }
}
