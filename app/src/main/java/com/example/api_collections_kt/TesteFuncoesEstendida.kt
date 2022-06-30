package com.example.api_collections_kt

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),//Transforma a String em BigDecimal
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("----------------------")
    println(salarios.somatoria())//Somatoria de todos salários

    println("----------------------")
    println(salarios.media())//Média de todos salários

}