package com.endana.app.data.data_store.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.endana.app.data.model.ProductEntity

@Database(entities = [ProductEntity::class], version = 1, exportSchema = false)
 abstract class EndanaDatabase: RoomDatabase(){

    abstract fun productDao(): ProductDao


    companion object{
      const val DATABASE_NAME = "endana_db"
    }

}