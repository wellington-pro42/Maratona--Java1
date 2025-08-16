package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturarsCondicionais06 {
    public static void main(String[] args) {
        int DiaDaSemana = 1;
        switch (DiaDaSemana) {
            case 1:
                System.out.println("domingo, fim de semana");
                break;
            case 2:
                System.out.println("dia util, segunda");
                break;
            case 3:
                System.out.println("dia util, terça");
                break;
            case 4:
                System.out.println("dia util, quarta");
                break;
            case 5:
                System.out.println("dia util, quinta");
                break;
            case 6:
                System.out.println("dia util, friday");
                break;
            case 7:
                System.out.println("sabado, fim de semana");
                break;

            default:
                System.out.println("opcao invalida");
                break;
        }


    }
}
