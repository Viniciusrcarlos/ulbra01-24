package com.example.appprodutostde

fun String.convertToMoneyWithSymbol() = "R$ ".plus(this.replace(".",","))