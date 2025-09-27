package academy.devdojo.maratonajava.javacore.Atividades.dominio;

public class Funcionario extends Pessoas {
    private int salario;

    public Funcionario(String nome, int idade, int salario) {
        super(nome, idade);
        this.salario = salario;
    }


    @Override
    public void imprime() {
        super.imprime();
        System.out.println("salario: " + salario);
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
