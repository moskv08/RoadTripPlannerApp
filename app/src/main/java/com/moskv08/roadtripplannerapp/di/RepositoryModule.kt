package com.moskv08.roadtripplannerapp.di

import com.moskv08.roadtripplannerapp.data.repository.RoadTripRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        roadTripRepository: RoadTripRepository
    ): com.moskv08.roadtripplannerapp.domain.repository.RoadTripRepository
}