package academy.devdojo.maratonajava.javacore.Minterfaces.Test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoad;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoad databaseLoad = new DatabaseLoad();
        FileLoader fileLoader = new FileLoader();
        databaseLoad.load();
        fileLoader.load();
        System.out.println("===");

        databaseLoad.remove();
        fileLoader.remove();

        System.out.println("===");
        databaseLoad.ChekPermission();
        fileLoader.ChekPermission();

    }
}
