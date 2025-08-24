package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

    public void imprime() {
        System.out.println("==============");

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for (double salario : salarios) {
            System.out.println("Salário: " + salario);
        }
    }

    public double getMedia() {
        double soma = 0;
        for (double salario : salarios) {
            soma += salario;
        }
        return soma / salarios.length;


        //System.out.println("==============");
      //  System.out.println("Média salarial: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }


    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }


}
