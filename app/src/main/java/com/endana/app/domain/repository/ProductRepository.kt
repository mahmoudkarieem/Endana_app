package com.endana.app.domain.repository

import com.endana.app.domain.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductRepository {

    fun getProducts(): Flow<List<Product>>

    suspend fun getProductById(id: Int): Product
}