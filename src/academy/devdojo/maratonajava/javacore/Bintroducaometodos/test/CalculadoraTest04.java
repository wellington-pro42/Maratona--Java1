package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora04 = new Calculadora();
        int num1 = 10;
        int num2 = 20;
        calculadora04.alteraDoisNumeros(num1, num2);
        System.out.println("dentro do calculadora04");
        System.out.println(num1);
        System.out.println(num2);
    }

}
