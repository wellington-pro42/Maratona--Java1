package academy.devdojo.maratonajava.javacore.Atividades.Test01;

import java.util.Scanner;

public class ScanerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a primeira nota");
        double nota1 = scanner.nextDouble();

        System.out.println("digite a segunda nota");
        double nota2 = scanner.nextDouble();

        double resultado = (nota1 + nota2) /2;

        System.out.println(" a media é " + resultado);



    }
}
