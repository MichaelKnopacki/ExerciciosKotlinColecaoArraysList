package com.example.api_collections_kt

fun main(){

    val names = Array (3){" "}
    names[0] = "Michael"
    names[1] = "Mariana"
    names[2] = "Thaly"

    for ( nome in names){
        println(nome)
    }
    println("---------------------------------------")
    names.sort()
    names.forEach { println(it) }

    val names2 = arrayOf( "Pedro", "José", "Antonio")

    println("---------------------------------------")
    for ( nome in names2){
        println(nome)
    }
    println("---------------------------------------")
    names2.sort()
    names2.forEach { println(it) }

}
