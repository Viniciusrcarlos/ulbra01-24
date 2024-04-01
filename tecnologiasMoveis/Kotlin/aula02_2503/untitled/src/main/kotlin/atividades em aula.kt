package org.example

fun removerDuplicados(lista: List<Int>): List<Int> {
    return lista.toSet().toList()
}

fun ultimoImpar(lista: List<Int>): Int? {
    return lista.lastOrNull { it % 2 != 0 }
}

fun stringsMaiusculas(lista: List<String>): List<String> {
    return lista.map {
        it.toUpperCase()
    }
}

fun String.todasMaiusculas() = this.uppercase()

fun String.concatenarR() = if (this.toDoubleOrNull() != null) "R$ $this" else this


fun main() {
    val list = listOf(3, 2, 2, 3, 3, 4, 3, 21, 513, 43, 24, 324, 32, 54, 42, 313, 21, 312, 3, 21, 321, 3, 2)
    val listString = listOf("vinicius", "daniel", "lucas")
    println(removerDuplicados(list))

    println(ultimoImpar(list))

    println(stringsMaiusculas(listString))

    val preco = "32"
    val nome = "vinicius"

    println(preco.concatenarR())
    println(nome.todasMaiusculas())

}