package org.example

fun media(lista: List<Int>): Int {
    if(lista.isNotEmpty()) {
        var soma: Int = 0
        for(numero in lista) {
            soma += numero
        }
        return (soma / lista.size)
    } else {
        return 0
    }
}

fun par(lista: List<Int>): Int {
    
}

fun main() {

    var lista = listOf(10,20,30,15)
    println(media(lista))

}