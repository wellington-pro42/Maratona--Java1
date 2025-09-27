package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite Seu nome abaixo ");
        String nome = input.nextLine();
        System.out.println("digite a sua idade");
        int idade = input.nextInt();
        System.out.println("digite M ou F para seu sexo");
        char sexo = input.next().charAt(0);

        System.out.println("nome " + nome);
        System.out.println("idade " + idade);
        System.out.println("sexo " + sexo);

    }
}
