package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String qualidade;

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;

    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;


    }

    public void init(String nome, String tipo, int episodios, String genero, String qualidade) {
        this.init(nome, tipo, episodios, genero);
        this.qualidade = qualidade;


    }

    public void imprime() {
        System.out.println("tipo: " + this.tipo);
        System.out.println("episodios: " + this.episodios);
        System.out.println("nome: " + this.nome);
        System.out.println("genero: " + this.genero);
        System.out.println("qualidade: " + this.qualidade);

    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    public String getQualidade() {
        return qualidade;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getGenero() {
        return genero;
    }


    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;

    }

    public String getTipo() {
        return this.tipo;

    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;

    }

    public int getEpisodios() {
        return this.episodios;
    }

}
