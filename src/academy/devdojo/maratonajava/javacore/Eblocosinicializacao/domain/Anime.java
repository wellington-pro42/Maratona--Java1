package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String qualidade;

    public Anime(String nome, String tipo, String qualidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.qualidade = qualidade;

    }


//episódios, gênero, qualidade, estúdio e autor.

    public void imprime() {
        System.out.println("nome: " + this.nome);
        System.out.println("tipo: " + this.tipo);
        System.out.println("episodios: " + this.episodios);
        System.out.println("qualidade: " + this.qualidade);

    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    public String getQualidade() {
        return qualidade;
    }
}




