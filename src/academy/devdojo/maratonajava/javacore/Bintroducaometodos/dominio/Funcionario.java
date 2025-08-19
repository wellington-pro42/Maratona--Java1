package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println("==============");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        for (double salario : salarios) {
            System.out.println("Salário: " + salario);
        }
    }

    public void MediaSalario() {
        double soma = 0;
        for (double salario : salarios) {
            soma += salario;
        }
        double media = soma / salarios.length;

        System.out.println("==============");
        System.out.println("Média salarial: " + media);
    }
}
