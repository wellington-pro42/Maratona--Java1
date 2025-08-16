package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class Professortest {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.nome = "wellington";
        professor1.idade = 22;
        professor1.sexo = 'm';

        System.out.println("nome: " + professor1.nome + " idade: " + professor1.idade + " sexo: " + professor1.sexo);


    }
}
