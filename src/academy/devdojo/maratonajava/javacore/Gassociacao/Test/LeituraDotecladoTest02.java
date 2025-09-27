package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import java.util.Scanner;

public class LeituraDotecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Software de previsão do futuro Digite sua pergunta e eu responderei com sim ou não");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' '){
            System.out.println("Não");
        }
        else {
            System.out.println("sim");
        }

    }
}
