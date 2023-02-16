package com.moskv08.roadtripplannerapp.data.local

import androidx.room.*

@Dao // Data Access Object
interface TripDao {

    // Flow to receive emitted updates on immediate change
    @Query("SELECT * FROM trip")
    fun getAllTrips(): List<TripEntity>

    // If Id already exists just update existing entry
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertTrip(trip: TripEntity)

//    @Delete
//    suspend fun deleteTrip(note: TripEntity)

    /*
    * Select specific Trip
     */
//    @Query("SELECT * FROM trip WHERE id = :id")
//    suspend fun getTripById(id: Int): TripEntity?
}