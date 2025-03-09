class Pagamento {
    void processar() {
        System.out.println("Pagamento processado.");
    }
}

class Pedido {
    int numero;

    Pedido(int numero) {
        this.numero = numero;
    }

    void realizarPagamento(Pagamento pagamento) { // Pedido depende de Pagamento para ser concluído
        System.out.println("Pedido " + numero + " sendo pago...");
        pagamento.processar();
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1234);
        Pagamento pagamento = new Pagamento();
        pedido.realizarPagamento(pagamento);
    }
}
