package academy.devdojo.maratonajava.javacore.Kenum.Test.Cliente;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class Test01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Wellington", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Fabiana", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        // Correção aqui: usar o nome exato da constante enum
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());

        TipoCliente tipoCliente2 = TipoCliente.tipoClientepornomeRelatorio("pessoa fisica");
        System.out.println(tipoCliente2);
    }
}
