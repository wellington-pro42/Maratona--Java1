package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double ValorTotal = 30000;
        for (int parcela = 1; parcela <= ValorTotal; parcela++) {
            double Valorparcela = ValorTotal / parcela;
            if (Valorparcela >= 1000) {
                System.out.println("parcela" + parcela + "$" + Valorparcela);

            }
        }


    }
}
