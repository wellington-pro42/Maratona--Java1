package academy.devdojo.maratonajava.javacore.Lclasesabstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        CalculaBonus();
    }

 //   @Override
   // public void imprime() {
       // System.out.println("imprimindo");
  //  }




    public abstract void CalculaBonus();


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
