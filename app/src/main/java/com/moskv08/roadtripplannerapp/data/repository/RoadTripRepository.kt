package com.moskv08.roadtripplannerapp.data.repository

import com.moskv08.roadtripplannerapp.data.local.RoadTripDatabase
import com.moskv08.roadtripplannerapp.domain.model.Trip
import com.moskv08.roadtripplannerapp.data.mapper.toTrip
import javax.inject.Inject
import javax.inject.Singleton
import com.moskv08.roadtripplannerapp.domain.repository.RoadTripRepository
import com.moskv08.roadtripplannerapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

@Singleton
class RoadTripRepository @Inject constructor(
    private val db: RoadTripDatabase
): RoadTripRepository {
    override suspend fun getAllRoadTrips(): Flow<Resource<List<Trip>>> {
        return flow {

            emit(Resource.isLoading(true))
            val listOfTrips = db.dao.getAllTrips()

            emit(Resource.Success(
                data = listOfTrips.map { it.toTrip() }
            ))

            emit(Resource.isLoading(false))

        }.catch {
            emit(Resource.Error("Hi there. Something went wrong here!"))
        }
    }
}