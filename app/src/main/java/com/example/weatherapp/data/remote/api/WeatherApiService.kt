package com.example.weatherapp.data.remote.api

import com.example.weatherapp.data.remote.models.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface WeatherApiService {

    @GET("alerts.json")
    fun getWeatherAlerts(
        @Header("x-rapidapi-key")
        apiKey: String,

        @Header("x-rapidapi-host")
        apiHost: String,

        @Query("q")
        location: String

    ): Call<WeatherResponse>

}