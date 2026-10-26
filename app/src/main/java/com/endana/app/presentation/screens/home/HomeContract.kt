package com.endana.app.presentation.screens.home

import com.endana.app.domain.model.ProductModel

data class HomeUiState(
    val isLoading: Boolean=false
    ,val products: List<ProductModel> =emptyList(),
    val errorMessage: String?=null

)


sealed interface HomeUiIntent{
    object LoadProducts : HomeUiIntent
}