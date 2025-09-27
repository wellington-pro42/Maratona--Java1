package academy.devdojo.maratonajava.javacore.Lclasesabstratas.Test;

//import academy.devdojo.maratonajava.javacore.Lclasesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclasesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclasesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Wellington", 8000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Maria", 5000);
        System.out.println(desenvolvedor);
        System.out.println(gerente);

    }
}
