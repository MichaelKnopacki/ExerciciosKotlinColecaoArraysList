package com.example.api_collections_kt

fun main(){

    val salarios = DoubleArray( 3 )

    salarios[0] = 1000.00
    salarios[1] = 3000.00
    salarios[2] = 500.00

    salarios.forEach { println(it) }

    println("---------------------------")

    salarios.forEachIndexed{ index, salario -> //Index é a posição
        salarios[index] = salario * 1.1 // Foi somado um aumento de 1.1 em cada salário
      //Salario [posicao]
    }

    salarios.forEach { println(it) }

    println("---------------------------")

    val salarios2 = doubleArrayOf(1500.0, 1350.0, 5000.0 )

    salarios2.sort()//Imprime de forma crescente
    salarios2.forEach { println(it) }
}