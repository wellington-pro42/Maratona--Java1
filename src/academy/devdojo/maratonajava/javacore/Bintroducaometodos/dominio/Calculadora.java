package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisnumeros() {
        System.out.println(10 + 10);
    }

    public void subitraiDoisnumeros() {
        System.out.println(20 - 10);
    }

    public void multiplicaDoisnumeros(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public double divideDoisnumeros(double nume1, double nume2) {
        if (nume2 == 0) {
            System.out.println("não é possive dividir por zero:");
            return 0;
        }
        return nume1 / nume2;

    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println(" Dentro do Altera Dois Numeros ");
        System.out.println(" Num1 " + numero1);
        System.out.println(" Num2 " + numero2);


    }

}

