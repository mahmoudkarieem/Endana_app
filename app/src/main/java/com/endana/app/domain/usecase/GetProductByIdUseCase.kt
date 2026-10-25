package com.endana.app.domain.usecase

import com.endana.app.domain.model.ProductModel
import com.endana.app.domain.repository.ProductRepository

class GetProductByIdUseCase(
    private val productRepository: ProductRepository
) {
   suspend operator fun invoke(id: Int): ProductModel?{
        return productRepository.getProductById(id=id)
}}