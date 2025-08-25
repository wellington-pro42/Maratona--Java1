package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String qualidade;
    private String estudio;
    private String autor;
    private int anoLançamento;


    public Anime(String nome, String tipo, int episodios, String genero, String qualidade) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        this.qualidade = qualidade;

    }


    public Anime(String nome, String tipo, int episodios, String genero, String qualidade, String estudio) {
        this(nome, tipo, episodios, genero, qualidade);
        this.estudio = estudio;

    }

    public Anime(String nome, String tipo, int episodios, String genero, String qualidade, String estudio, String autor) {
        this(nome, tipo, episodios, genero, qualidade, estudio);
        this.autor = autor;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String qualidade, String estudio, String autor, int anoLançamento) {
        this(nome, tipo, episodios, genero, qualidade, estudio, autor);
        this.anoLançamento = anoLançamento;

    }


    public Anime() {

    }


    public void imprime() {
        System.out.println("tipo: " + this.tipo);
        System.out.println("episodios: " + this.episodios);
        System.out.println("nome: " + this.nome);
        System.out.println("genero: " + this.genero);
        System.out.println("qualidade: " + this.qualidade);
        System.out.println("Estudio " + estudio);
        System.out.println("autor" + autor);
        System.out.println("anodelançamento " + anoLançamento);


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

    void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
