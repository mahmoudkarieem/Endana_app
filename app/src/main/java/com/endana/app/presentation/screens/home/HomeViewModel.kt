package com.endana.app.presentation.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.endana.app.domain.usecase.GetProductsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getProductsUseCase: GetProductsUseCase
): ViewModel() {

  private val _uiState= MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        onIntent(HomeUiIntent.LoadProducts)
    }
    fun onIntent(intent: HomeUiIntent){
        when(intent)
        {
            is HomeUiIntent.LoadProducts-> getProducts()
        }

    }
  private  fun getProducts(){

       viewModelScope.launch {
           getProductsUseCase()
               .onStart {
                   _uiState.value=_uiState.value.copy(isLoading = true, errorMessage = null)
               }
               .catch {exception->
                   _uiState.value=_uiState.value.copy(isLoading = false, errorMessage =exception.localizedMessage )
               }
               .collect { listProducts->
                   _uiState.value=_uiState.value.copy(isLoading = false, products = listProducts)
               }
       }
    }
}