package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezIgualVinte = 10 == 20;
        System.out.println(isDezIgualVinte);
        System.out.println(isDezMaiorQueVinte);

        int Idade = 35;
        float Salario = 5000F;
        //
        boolean isDentroDaLei = Idade >= 30 && Salario >= 4612;
        System.out.println(isDentroDaLei);
        boolean isDentroDaLeiMenorQueTrinta = Idade < 30 && Salario >= 3381;
        System.out.println(isDentroDaLeiMenorQueTrinta);
        //
        double ValorContaPoupanca = 500;
        double ValorContaCorrente = 7000;
        float ValorDoPs5 = 10000;
        boolean isPlayTationCompravel = ValorContaPoupanca >= ValorDoPs5 || ValorContaCorrente >= ValorDoPs5;
        System.out.println(" PlayTationCompravel " + isPlayTationCompravel);
        //

        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);

    }
}
