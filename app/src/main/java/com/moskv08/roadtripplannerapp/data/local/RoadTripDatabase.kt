package com.moskv08.roadtripplannerapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    version = 1, // Increase number when updating definition
    entities = [TripEntity::class, LocationEntity::class, ActivityEntity::class],
    autoMigrations = [
        // AutoMigration(from = 3, to = 4)
    ],
    exportSchema = true
)
abstract class RoadTripDatabase: RoomDatabase() {
    // Generate database based on this definition
    abstract val dao: TripDao
}