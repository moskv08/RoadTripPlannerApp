package com.moskv08.roadtripplannerapp.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Activity")
data class LocationActivityEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "name")val name: String?,
    @ColumnInfo(name = "description")val description: String?,
    @ColumnInfo(name = "location_id")val locationId: String?,
)
