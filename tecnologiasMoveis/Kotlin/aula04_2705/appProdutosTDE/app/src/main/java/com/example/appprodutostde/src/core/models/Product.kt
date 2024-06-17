package com.example.appprodutostde.src.core.models

import java.io.Serializable

data class Product(
    val uuid: String,
    val urlImage: String,
    val name: String,
    val price: String,
    val description: String
) : Serializable{
    constructor() : this("", "", "", "", "")
}
