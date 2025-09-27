package academy.devdojo.maratonajava.javacore.Atividade2.dominio;

 public enum TipoPagamento {
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    BOLETO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.2;
        }
    };

    public abstract double calcularDesconto(double valor);
}



