package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
      Anime anime1 = new Anime( "Zoro", "aventura", "muito bom ");
      anime1.setEpisodios(50);

      anime1.imprime();


    }

}
