package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturarsCondicionais04 {
    public static void main(String[] args) {
        double salarioanual = 70000;
        double Primeirafaixa = 9.70 / 100;
        double Segundafaixa = 37.35 / 100;
        double Terceirafaixa = 49.50 / 100;
        double Valordoimposto;
        if (salarioanual <= 34712) {
            Valordoimposto = salarioanual * Primeirafaixa;
        } else if (salarioanual >= 34713 && salarioanual <= 68507) {
            Valordoimposto = salarioanual * Segundafaixa;

        } else {
            Valordoimposto = salarioanual * Terceirafaixa;
        }
        System.out.println(Valordoimposto);


    }


}
