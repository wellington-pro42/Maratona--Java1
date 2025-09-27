package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime2 {
    private String nome;
    private int[] episodios;

    public Anime2(String nome) {
        this.nome = nome;
    }

    {
        System.out.println("dentro do bloco de inicializacao");

    }

    public Anime2() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
        for (int episodios : this.episodios) {
            System.out.println(episodios);

        }
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

