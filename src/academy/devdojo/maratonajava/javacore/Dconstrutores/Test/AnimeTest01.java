package academy.devdojo.maratonajava.javacore.Dconstrutores.Test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime(" BORUTO", "anime", 40, "comedia", "muito bom", "PRODUCTION WG", " LEON ",2005);
        Anime anime2 = new Anime("naruto", "anime", 50, "comedia", "god", "ESTUDIO WANNER", " GUSTAV ",2013);


        anime1.imprime();
        System.out.println("====================");
        anime2.imprime();


    }
}
