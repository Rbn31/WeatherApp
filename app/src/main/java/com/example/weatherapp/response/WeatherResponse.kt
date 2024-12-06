package com.example.weatherapp.response

import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    @SerializedName("location")
    val location: Location,

    @SerializedName("alerts")
    val alerts: Alerts
)

data class Location(
    @SerializedName("name")
    val name: String,

    @SerializedName("region")
    val region: String,

    @SerializedName("country")
    val country: String,

    @SerializedName("lat")
    val latitude: Double,

    @SerializedName("lon")
    val longitude: Double,

    @SerializedName("tz_id")
    val timeZoneId: String,

    @SerializedName("localtime_epoch")
    val localtimeEpoch: Long,

    @SerializedName("localtime")
    val localtime: String
)

data class Alerts(
    @SerializedName("alert")
    val alertList: List<Alert>
)

data class Alert(
    @SerializedName("headline")
    val headline: String,

    @SerializedName("msgtype")
    val messageType: String,

    @SerializedName("severity")
    val severity: String,

    @SerializedName("urgency")
    val urgency: String,

    @SerializedName("areas")
    val areas: String,

    @SerializedName("category")
    val category: String,

    @SerializedName("certainty")
    val certainty: String,

    @SerializedName("event")
    val event: String,

    @SerializedName("note")
    val note: String?,

    @SerializedName("effective")
    val effective: String,

    @SerializedName("expires")
    val expires: String,

    @SerializedName("desc")
    val description: String,

    @SerializedName("instruction")
    val instruction: String
)
