package com.moskv08.roadtripplannerapp.domain.repository

import com.moskv08.roadtripplannerapp.domain.model.Trip
import com.moskv08.roadtripplannerapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface RoadTripRepository {

    suspend fun getAllRoadTrips(): Flow<Resource<List<Trip>>>
}