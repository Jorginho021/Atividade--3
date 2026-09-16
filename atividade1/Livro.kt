// Livro.kt
class Livro(
    var titulo: String,
    var autor: String,
    var paginas: Int
) {
    fun resumo() {
        println("$titulo, de $autor ($paginas páginas)")
    }
}

fun main() {
    val livro1 = Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178)
    val livro2 = Livro("Dom Casmurro", "Machado de Assis", 256)

    livro1.resumo()
    livro2.resumo()
}
