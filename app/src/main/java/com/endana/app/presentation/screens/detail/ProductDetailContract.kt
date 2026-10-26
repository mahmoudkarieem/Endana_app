package com.endana.app.presentation.screens.detail

import com.endana.app.domain.model.ProductModel

data class ProductDetailContract(
        val isLoading: Boolean=false,
    val errorMessage: String?=null,
    val product: ProductModel?=null

        )


sealed interface ProductDetailUiIntent{
    data class LoadProductDetails(val id: Int): ProductDetailUiIntent
}