package com.moskv08.roadtripplannerapp.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "Location",
    foreignKeys = [
        ForeignKey(
        entity = TripEntity::class,
        childColumns = ["trip_id"],
        parentColumns = ["id"]
    )]
)
data class LocationEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "description") val description: String?,
    @ColumnInfo(name = "trip_id") val tripId: Long,
    @ColumnInfo(name = "country") val country: String
)
