// Funcionario.kt
open class Funcionario(
    var nome: String,
    var salario: Double
) {
    open fun calcularBonus(): Double {
        return salario * 0.10
    }
}

class Gerente(
    nome: String,
    salario: Double
) : Funcionario(nome, salario) {
    override fun calcularBonus(): Double {
        return salario * 0.20
    }
}

fun main() {
    val func = Funcionario("Carlos", 3000.00)
    val ger = Gerente("Ana", 7000.00)

    println("Bônus de ${func.nome}: R$ ${func.calcularBonus()}")
    println("Bônus de ${ger.nome}: R$ ${ger.calcularBonus()}")
}
