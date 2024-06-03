package com.example.appprodutostde.src.core.extensions

fun String.convertToMoneyWithSymbol() = "R$ ".plus(this.replace(".",","))