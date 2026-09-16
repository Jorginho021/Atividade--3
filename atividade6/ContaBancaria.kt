// ContaBancaria.kt
open class ContaBancaria(saldoInicial: Double) {
    var saldo: Double = saldoInicial
        protected set // Permite alterar o saldo na própria classe e em subclasses (como ContaEspecial)

    open fun sacar(valor: Double) {
        if (saldo - valor >= 0) {
            saldo -= valor
            println("Saque realizado. Novo saldo: R$ $saldo")
        } else {
            println("Saldo insuficiente para realizar o saque.")
        }
    }
}

class ContaEspecial(saldoInicial: Double) : ContaBancaria(saldoInicial) {

    override fun sacar(valor: Double) {
        if (saldo - valor >= -500.0) {
            saldo -= valor
            println("Saque especial realizado. Novo saldo: R$ $saldo")
        } else {
            println("Limite de crédito especial excedido (-R$ 500.00).")
        }
    }
}

fun main() {
    println("--- Teste Conta Bancária Normal ---")
    val contaComum = ContaBancaria(100.0)
    contaComum.sacar(200.0)

    println("\n--- Teste Conta Especial ---")
    val contaEspecial = ContaEspecial(100.0)
    contaEspecial.sacar(400.0)
    contaEspecial.sacar(300.0)
}
