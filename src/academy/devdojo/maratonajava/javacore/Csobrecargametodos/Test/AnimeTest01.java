package academy.devdojo.maratonajava.javacore.Csobrecargametodos.Test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        anime1.init("naruto", "TV", 50, "comedia", "muito bom ");
        anime1.imprime();

    }
}
