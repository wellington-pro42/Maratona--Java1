package academy.devdojo.maratonajava.introducao.Atividadefacul.dominio;

public class CalculadoraTaxa {


    public static void calcular(MetodoPagamento pagamento) {
        System.out.println("Método: " + pagamento.getNome());
        System.out.println("Valor: " + pagamento.getValor());
        System.out.println("Taxa: " + pagamento.calculartaxa());
        System.out.println("------------------------");
    }


}


