package com.example.api_collections_kt

fun main(){

    val joao = Funcionario ( "Joao", 2000.0, "CLT")
    val pedro = Funcionario ( "Pedro", 1500.0, "PJ")
    val maria = Funcionario ( "Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it)}

    println("------------------")
    println(funcionarios.find { it.nome == "Maria" })//imprime apenas a Maria dentro do Array

    println("------------------")
    funcionarios
        .sortedBy { it.salario } // Ele organiza de forma crescente com base no salário
        .forEach { println(it) }

    println("------------------")
    funcionarios
        .sortedBy { it.nome } // Ele organiza de forma crescente com base no nome
        .forEach { println(it) }

    println("------------------")
    funcionarios
        .groupBy { it.tipoContratacao }//Agrupou pelo tipo de contratacao e imprime em uma mesma linha
        .forEach { println(it) }

}



