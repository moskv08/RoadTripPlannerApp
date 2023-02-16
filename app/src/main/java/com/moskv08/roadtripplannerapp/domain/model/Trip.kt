package com.moskv08.roadtripplannerapp.domain.model

data class Trip(
    val name: String,
    val description: String?,
    val startDate: Long,
    val endDate: Long
)
