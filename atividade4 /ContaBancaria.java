// ContaBancaria.java
public class ContaBancaria {
    double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}

// ContaEspecial.java
class ContaEspecial extends ContaBancaria {

    public ContaEspecial(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (saldo - valor >= -500.0) {
            saldo -= valor;
            System.out.println("Saque especial realizado. Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Limite de crédito especial excedido (-R$ 500.00).");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Teste Conta Bancária Normal ---");
        ContaBancaria contaComum = new ContaBancaria(100.0);
        contaComum.sacar(200.0); // Tenta deixar negativo

        System.out.println("\n--- Teste Conta Especial ---");
        ContaEspecial contaEspecial = new ContaEspecial(100.0);
        contaEspecial.sacar(400.0); // Deixa saldo em -300 (permitido)
        contaEspecial.sacar(300.0); // Tentaria deixar em -600 (bloqueado)
    }
}
