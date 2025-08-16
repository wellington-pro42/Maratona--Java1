package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class Calculadoratest03 {
    public static void main(String[] args) {
        Calculadora calculadora03 = new Calculadora();
        double result = calculadora03.divideDoisnumeros(100, 0);
        System.out.println(result);

    }
}
