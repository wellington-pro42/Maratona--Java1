package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void imprime() {
        System.out.println("======================");
        System.out.println("nome: " + this.nome);
        System.out.println("velocidademaxima: " + this.velocidadeMaxima);
        System.out.println("velocidadelimite: " + Carro.velocidadeLimite);

    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double  getVelocidadeLimite(){
        return Carro.velocidadeLimite;

    }


    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return this.nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;

    }


}
