package com.endana.app.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products_table")
data class ProductEntity(
    val image: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description:  String,
    val price: Double,
    val  merchant: String
)
