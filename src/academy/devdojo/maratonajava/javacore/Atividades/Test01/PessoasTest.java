package academy.devdojo.maratonajava.javacore.Atividades.Test01;

import academy.devdojo.maratonajava.javacore.Atividades.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Atividades.dominio.Gerente;

public class PessoasTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Wellington", 23, 2500);
        Funcionario funcionario2 = new Funcionario("Fabiana", 20, 3000);
        funcionario.imprime();
        funcionario2.imprime();

        Gerente gerente = new Gerente("Fabiana", 20, 3000, "RH");
        Gerente gerente2 = new Gerente("Wellington", 23, 3000, "TI");
        gerente.imprime();
        gerente2.imprime();



    }
}
