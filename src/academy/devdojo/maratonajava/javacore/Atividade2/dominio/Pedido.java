package academy.devdojo.maratonajava.javacore.Atividade2.dominio;

public class Pedido {
    private int id;
    private String descricao;
    StatusPedido statusPedido;

    public Pedido(int id, String descricao, StatusPedido statusPedido) {
        this.id = id;
        this.descricao = descricao;
        this.statusPedido = statusPedido;
    }

    public void imprime(){
        System.out.println("=====");
        System.out.println("id: " + id);
        System.out.println("descricao: " + descricao);
        System.out.println("status do pedido: " + statusPedido);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }
}
