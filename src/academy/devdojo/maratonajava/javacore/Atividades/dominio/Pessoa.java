package academy.devdojo.maratonajava.javacore.Atividades.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public Pessoa(){

    }

    public void imprime(){
        System.out.println("===============");
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
    }

    public void setNome(String nome){

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
