package academy.devdojo.maratonajava.introducao.Atividadefacul.dominio;

public class Produto {
    private int codigo;
    private String texto;
    private double valor;
    private int quantidadeEstoque;

    public Produto(int codigo, String texto, double valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.texto = texto;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void imprime(){
        System.out.println("===========");
        System.out.println("codigo " + codigo);
        System.out.println("texto " + texto);
        System.out.println("valor " + valor);
        System.out.println("quantidade no estoque " + quantidadeEstoque);

    }

    public void reajustarProduto(){
        if (quantidadeEstoque >= 30 ){
            valor += valor *0.05;
        }

        else {
            valor += valor * 0.075;
        }

    }



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
