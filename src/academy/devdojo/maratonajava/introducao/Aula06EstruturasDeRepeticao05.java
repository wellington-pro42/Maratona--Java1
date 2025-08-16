package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //imprima os primeiros 25 numeros de um dado valor
        int numeromax = 50;
        for (int i = 0; i < numeromax; i++) {
            if (i > 25) {
                break;

            }
            System.out.println(i);
        }

    }
}
