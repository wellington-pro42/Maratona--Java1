package academy.devdojo.maratonajava.javacore.Lclasesabstratas.dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);

    }

    @Override
    public void CalculaBonus() {
        this.salario = this.salario + this.salario * 0.3;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
