package com.example.api_collections_kt

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)//Conjunto um
    val funcionarios2 = setOf(maria)//Conjunto dois

    val resultUnion = funcionarios1.union(funcionarios2)//Une os dois conjuntos
    resultUnion.forEach { println(it) }

    println("-----------------")

    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)//Subtrai os funcionarios do conjunto 2
    resultSubtract.forEach { println(it) }

    println("-----------------")

    val resultIntersect = funcionarios3.intersect(funcionarios2)//Aqui ele imprime o que tem de comum nos dois conjuntos
    resultIntersect.forEach { println(it) }

}