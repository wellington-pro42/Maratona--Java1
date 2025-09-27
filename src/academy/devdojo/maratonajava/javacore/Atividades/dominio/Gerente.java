package academy.devdojo.maratonajava.javacore.Atividades.dominio;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, int idade, int salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("departamento: " + departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
