package com.example.api_collections_kt

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()//Instanciando um repositorio; T generics é o <Funcionario>

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))//Imprimiu os dados da Maria que foram salvos no repositório, buscando pelo ID

    println("----------------------")

    repositorio.findAll().forEach { println(it) }//Imprime tudo que costa dentro do repositorio

    println("----------------------")

    repositorio.remove(maria.nome)// Removeu Maria do repositorio
    repositorio.findAll().forEach { println(it) }
}