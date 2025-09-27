package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    public Anime(String nome) {
        this.nome = nome;
    }

    static {
        System.out.println("dentro do bloco de inicializacao");

    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
        for (int episodios : Anime.episodios) {
            System.out.println(episodios);

        }
    }

    public int[] getEpisodios() {
        return episodios;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

