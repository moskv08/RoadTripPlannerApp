package com.moskv08.roadtripplannerapp.data.mapper

import com.moskv08.roadtripplannerapp.data.local.LocationEntity
import com.moskv08.roadtripplannerapp.domain.model.Location

fun LocationEntity.toLocation(): Location {
    return Location(
        name = name,
        description = description,
        country = country
    )
}

// TODO: Pass in trip id information
fun Location.toLocationEntity(): LocationEntity {
    return LocationEntity(
        name = name,
        description = description,
        country = country,
        tripId = 1
    )
}