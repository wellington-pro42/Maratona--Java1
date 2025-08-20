package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class Funcionariotest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Wellington";
        funcionario1.idade = 22;
        funcionario1.salarios = new double[]{1500, 5000, 7200};

        funcionario1.imprime();
        funcionario1.MediaSalario();
    }
}
