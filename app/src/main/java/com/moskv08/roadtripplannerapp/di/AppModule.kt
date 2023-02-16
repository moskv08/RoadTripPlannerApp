package com.moskv08.roadtripplannerapp.di

import android.app.Application
import androidx.room.Room
import com.moskv08.roadtripplannerapp.data.local.RoadTripDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideRoadTripDatabase(app: Application): RoadTripDatabase {
        return Room.databaseBuilder(
            app,
            RoadTripDatabase::class.java,
            "roadtripdb.db"
        ).build()
    }

//    @Provides
//    @Singleton
//    fun provideStockApi(): StockApi {
//        return Retrofit.Builder()
//            .baseUrl(StockApi.BASE_URL)
//            .addConverterFactory(MoshiConverterFactory.create())
//            .build()
//            .create()
//    }

}