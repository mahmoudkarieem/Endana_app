package com.endana.app.data.data_store.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.endana.app.data.model.ProductEntity
import kotlinx.coroutines.flow.Flow
@Dao
interface ProductDao {
    @Query("select * from products_table")
     fun getProducts(): Flow<List<ProductEntity>>
    @Query("select * from products_table where id=:id")
    suspend fun getProductById(id: Int): ProductEntity?

@Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProducts(products: List<ProductEntity>)
}