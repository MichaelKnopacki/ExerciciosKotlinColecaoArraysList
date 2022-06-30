package com.example.api_collections_kt

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    println("--------- LIST ---------")
    val funcionarios = mutableListOf(joao, maria)//Lista Mutavel (Editavel) de Funcionários
    funcionarios.forEach { println(it) }

    println("------------------")
    funcionarios.add(pedro)//Adicionou o Pedro a Lista
    funcionarios.forEach { println(it) }

    println("------------------")
    funcionarios.remove(joao)//Remove Joao a lista
    funcionarios.forEach { println(it) }

    println("--------- SET ---------")

    val funcionarioSet = mutableSetOf(joao)//Adicionado a lista funcionarioSet o joao
    funcionarioSet.forEach { println(it) }

    println("------------------")
    funcionarioSet.add(pedro)// Além do Joao foi adicionado o Pedro e a Maria a lista
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("------------------")
    funcionarioSet.remove(maria)// A Maria foi removida
    funcionarioSet.forEach { println(it) }
}