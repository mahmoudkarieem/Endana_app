package com.endana.app.domain.repository

import com.endana.app.domain.model.ProductModel
import kotlinx.coroutines.flow.Flow

interface ProductRepository {

    fun getProducts(): Flow<List<ProductModel>>

    suspend fun getProductById(id: Int): ProductModel
}