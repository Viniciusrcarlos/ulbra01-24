package org.example.classes

class Carro(val cor: String, val marca: String) {

    constructor(cor: String): this(cor, marca = "")
    

}