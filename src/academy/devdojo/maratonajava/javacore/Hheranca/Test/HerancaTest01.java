package academy.devdojo.maratonajava.javacore.Hheranca.Test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("rua miraflores ");
        endereco.setCep("04842-4730");

        Pessoa pessoa = new Pessoa("Wellington");
        pessoa.setCpf("1234567889");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua da Cadeia" );
        endereco2.setCep("1258-7989");
        Funcionario funcionario = new Funcionario("Fabiana");
        funcionario.setSalario(1500);
        funcionario.setCpf("133754-04476");
        funcionario.setEndereco(endereco2);




        funcionario.imprime();

    }
}
