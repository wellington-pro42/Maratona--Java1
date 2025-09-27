package academy.devdojo.maratonajava.javacore.Atividades.dominio;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String matricula, String nome, int idade) {

        super(nome,idade );
        this.matricula = matricula;
    }

    public void imprime(){
        super.imprime();
        System.out.println("matricula: " + this.matricula);

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


}
