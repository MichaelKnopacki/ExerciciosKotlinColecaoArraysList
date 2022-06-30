package com.example.api_collections_kt

fun main(){

    val salarios = doubleArrayOf(1000.00, 2250.00, 4000.00)

    for (salario in salarios){
        println(salario)
    }

    println("-----------------------------------------------")

    println("Maior salário : ${salarios.maxOrNull()}")//Maior salário
    println("Menor salário : ${salarios.minOrNull()}")//Menor salário
    println("Média salárial : ${salarios.average()}")// Média dos salários

    println("-----------------------------------------------")

    val salariosMaiorQue2000 = salarios.filter { it > 2000 }//filtrou salários maiores que 2000
    println(salariosMaiorQue2000)

    println("-----------------------------------------------")

    println(salarios.count {it in 2000.0 .. 5000.0} ) //contou quantos valores do ARRAY tem entre 2 mil e 5 mil

    println("-----------------------------------------------")

    println(salarios.find { it == 2250.0} ) //vai direto no valor a ser procurado
    println(salarios.find { it == 500.0} ) //não encontra esse valor, logo ele imprime um NULL

    println("-----------------------------------------------")

    println(salarios.any { it == 1000.0} )//ele encontrou dentro do array o 1000, então imprime TRUE
    println(salarios.any { it == 1200.0} )//ele não encontrou dentro do array o 1200, então imprime FALSE

    println("-----------------------------------------------")


}