package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.Dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.Dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Wellington");
        Time time1 = new Time("Seleção Brasileira");
        jogador1.setTime(time1);
        jogador1.imprime();

    }
}
