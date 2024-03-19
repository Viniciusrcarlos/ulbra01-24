package org.example

fun media01(listaInteiro: List<Int> ) {

    if(listaInteiro.isNotEmpty()) {
        var soma = 0
        for (numero in listaInteiro) {
            soma += numero
        }
        val media = soma / listaInteiro.size

        println("A media é: " + media)
    } else {
        println("Lista vazia.")
    }
}

fun traduzir(str: String): String {

    return when(str) {
        "blue" -> "Azul"
        "red" -> "Vermelho"
        "greed" -> "Verde"
        "yellow" -> "Amarelo"
        else -> "Sem traducao"
    }

}

fun main() {

    val listaDeInteiro = listOf(3,2,4,5,6)
    media01(listaDeInteiro)
    media01(listOf())

    traduzir("red")
    traduzir("rud")

}