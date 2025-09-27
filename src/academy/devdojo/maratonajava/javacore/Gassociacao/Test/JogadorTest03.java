package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.Dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.Dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time1 = new Time("Flamengo");
        Jogador[] jogadores = {jogador1};

        jogador1.setTime(time1);

        time1.setJogadores(jogadores);

        System.out.println("===jogador===");
        jogador1.imprime();
        System.out.println("===time===");
        time1.imprime();


    }
}
