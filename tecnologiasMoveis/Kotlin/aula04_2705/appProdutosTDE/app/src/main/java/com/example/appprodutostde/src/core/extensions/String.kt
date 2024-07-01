package com.example.appprodutostde.src.core.extensions

fun String.convertToMoneyWithSymbol() = "R$ ".plus(this.replace(".",","))
fun String.formatCurrency(): String {
    val formattedString = this.replace(".", ",")
    val parts = formattedString.split(",")
    val integerPart = parts[0].reversed().chunked(3).joinToString(".").reversed()
    val decimalPart = if (parts.size > 1) parts[1] else "00"
    return "R$ $integerPart,$decimalPart"
}