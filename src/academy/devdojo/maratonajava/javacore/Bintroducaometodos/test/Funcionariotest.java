package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

import java.lang.management.GarbageCollectorMXBean;

public class Funcionariotest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("wellington");
        funcionario1.setIdade(23);
        funcionario1.setSalarios(new double[]{1500, 983.82, 7200});


        funcionario1.imprime();
        System.out.println("media salarial " + funcionario1.getMedia());


    }
}
