package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoad implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("removendo do banco de dados");

    }

    @Override
    public void ChekPermission() {
        System.out.println("checando permissoes no banco de dados");
    }
}
