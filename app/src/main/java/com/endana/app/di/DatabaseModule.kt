package com.endana.app.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.endana.app.data.data_store.local.EndanaDatabase
import com.endana.app.data.data_store.local.ProductDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

@Provides
@Singleton
    fun provideDatabase(
    @ApplicationContext    context: Context
    ): EndanaDatabase{
        return Room.databaseBuilder(
context.applicationContext,
            EndanaDatabase::class.java,
            EndanaDatabase.DATABASE_NAME

        ).build()
    }

    @Provides
    @Singleton
    fun productDao(database: EndanaDatabase): ProductDao{
        return database.productDao()
    }
}