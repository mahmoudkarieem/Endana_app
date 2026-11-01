package com.endana.app.data.repository

import com.endana.app.data.data_store.local.ProductDao
import com.endana.app.data.mappers.toDomain
import com.endana.app.domain.model.ProductModel
import com.endana.app.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    val productDao: ProductDao
) : ProductRepository {
    override fun getProducts(): Flow<List<ProductModel>> {
        return productDao.getProducts().map { entities ->
            entities.map { it.toDomain() }
        }
    }

    override suspend fun getProductById(id: Int): ProductModel? {
        return productDao.getProductById(id = id)?.toDomain()
    }


}


