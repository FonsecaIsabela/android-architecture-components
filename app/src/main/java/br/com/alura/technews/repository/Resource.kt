package br.com.alura.technews.repository

import br.com.alura.technews.model.Noticia

class Resource<T>(
    val dado: T?,
    val erro: String? = null
)