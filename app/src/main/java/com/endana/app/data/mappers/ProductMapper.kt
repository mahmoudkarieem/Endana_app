package com.endana.app.data.mappers

import com.endana.app.data.model.ProductEntity
import com.endana.app.domain.model.ProductModel

fun ProductModel.toEntity(): ProductEntity{
    return ProductEntity(
        id=this.id,
        description = this.description,
        merchant = this.merchant,
        title  =this.title,
        price = this.price,
        image = this.image
    )
}


fun ProductEntity.toDomain(): ProductModel{
    return ProductModel(
        id = this.id,
        image = this.image,
        description = this.description,
        title = this.title,
        merchant = this.merchant,
        price = this.price
    )
}