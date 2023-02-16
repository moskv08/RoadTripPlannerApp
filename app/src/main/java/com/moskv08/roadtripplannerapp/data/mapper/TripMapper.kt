package com.moskv08.roadtripplannerapp.data.mapper

import com.moskv08.roadtripplannerapp.data.local.LocationEntity
import com.moskv08.roadtripplannerapp.data.local.TripEntity
import com.moskv08.roadtripplannerapp.domain.model.Location
import com.moskv08.roadtripplannerapp.domain.model.Trip

// Trip
fun TripEntity.toTrip(): Trip {
    return Trip(
        name = name,
        description = description,
        startDate = startDate,
        endDate = endDate
    )
}

fun Trip.toTripEntity(): TripEntity {
    return TripEntity(
        name = name,
        description = description,
        startDate = startDate,
        endDate = endDate
    )
}

// Location
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