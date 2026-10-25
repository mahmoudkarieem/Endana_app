package com.endana.app.domain.usecase

import com.endana.app.domain.model.ProductModel
import com.endana.app.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow

class GetProductsUseCase(
    private val productRepository: ProductRepository
) {
    operator fun invoke(): Flow<List<ProductModel>>{
    return    productRepository.getProducts()
    }
}