package academy.devdojo.maratonajava.javacore.Lclasesabstratas.dominio;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }


    public void CalculaBonus() {
        this.salario = this.salario + this.salario * 0.1;

    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
