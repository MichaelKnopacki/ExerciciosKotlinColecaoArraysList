package com.example.api_collections_kt

class Repositorio<T> {// T é um genérics do tipo do objeto
    private val map = mutableMapOf<String, T>() //Mapa é como um BD

    fun create(id: String, value: T) {
        map[id] = value//ID é a chave
    }

    fun remove(id: String) = map.remove(id)

    fun findById(id: String) = map[id]//

    fun findAll() = map.values
}