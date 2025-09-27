package academy.devdojo.maratonajava.javacore.Atividade2.Test;

import academy.devdojo.maratonajava.javacore.Atividade2.dominio.Pedido;
import academy.devdojo.maratonajava.javacore.Atividade2.dominio.StatusPedido;

public class PedidoTest {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(2155, "controle remoto", StatusPedido.ENVIADO);
        Pedido pedido2 = new Pedido(2142, "Pilha", StatusPedido.ENTREGUE);
        Pedido pedido3 = new Pedido(442, "Garrafa", StatusPedido.PROCESSANDO);
        Pedido pedido4 = new Pedido(122, "Quadro de fotos", StatusPedido.NOVO);
        Pedido pedido5 = new Pedido(345, "Bola de futbol", StatusPedido.ENTREGUE);

        pedido1.imprime();
        pedido2.imprime();
        pedido3.imprime();
        pedido4.imprime();
        pedido5.imprime();


    }
}
