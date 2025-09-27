package academy.devdojo.maratonajava.javacore.Atividades.dominio;
/*
Crie uma classe Produto com:

Atributos: nome (String), preco (double), quantidade (int).

Método: calcularValorTotal() que retorna preco * quantidade.

No main, crie 3 produtos, exiba o valor total de cada um e o total geral.
 */

public class Produto {
    private  String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public void imprime() {
        System.out.println("==============");

        System.out.println("nome: " + this.nome);
        System.out.println("preco: " + this.preco);
        System.out.println("quantidade: " + this.quantidade);

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return this.nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;

    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
