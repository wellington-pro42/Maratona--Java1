package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public abstract void load();

    default void ChekPermission() {
        System.out.println("Fazendo checagem de permissoes");
    }
}
