package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturarsCondicionais02 {
    public static void main(String[] args) {
        int idade = 5;

        if (idade < 15) {
            System.out.println("categoria infatil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("categoria juvenil");

        } else if (idade >= 18) {
            System.out.println("categoria adulto");

        }
    }
}
