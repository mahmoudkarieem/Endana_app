package com.endana.app.presentation.screens.detail

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.sqlite.SQLITE_DATA_INTEGER
import com.endana.app.domain.usecase.GetProductByIdUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductDetailViewModel  @Inject constructor(
    private val getProductByIdUseCase: GetProductByIdUseCase
): ViewModel() {

    private val _uiState=MutableStateFlow(ProductDetailContract())
    val uiState=_uiState.asStateFlow()
//
//init {
//    onIntent(intent = ProductDetailUiIntent.LoadProductDetails(id =1 ))
//}
    fun onIntent(intent: ProductDetailUiIntent){
        when(intent){
            is ProductDetailUiIntent.LoadProductDetails -> getProductById(intent.id)
        }

    }
private    fun getProductById(id: Int){
        viewModelScope.launch {
           _uiState.value=_uiState.value.copy(isLoading = true)
            try{
                val product=getProductByIdUseCase(id = id)
                _uiState.value =   _uiState.value.copy(
                    isLoading = false,
                    product = product,
                    errorMessage = if (product == null) "المنتج غير موجود" else null

                )

        }catch (e: Exception){
                _uiState.value =  _uiState.value.copy(
                isLoading = false,
                errorMessage = e.localizedMessage?:"حدث خطأ أثناء جلب تفاصيل المنتج"
            )
        }
        }

    }
}