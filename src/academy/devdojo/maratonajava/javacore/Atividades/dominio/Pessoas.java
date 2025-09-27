package academy.devdojo.maratonajava.javacore.Atividades.dominio;

public class Pessoas {
    private String nome;
    private int idade;

    public Pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("===========");
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
