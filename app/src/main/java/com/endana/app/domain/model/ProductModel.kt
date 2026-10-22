package com.endana.app.domain.model



data class ProductModel(
    val image: String,
    val id: Int,
    val title: String,
    val description:  String,
    val price: Double,
    val  merchant: String
)
