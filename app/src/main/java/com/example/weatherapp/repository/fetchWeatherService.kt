package com.example.weatherapp.repository

import com.example.weatherapp.response.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface fetchWeatherService {

    @GET("alerts.json")
    fun getWeatherAlerts(
        @Header("x-rapidapi-key") apiKey: String,
        @Header("x-rapidapi-host") apiHost: String,
        @Query("q") location: String
    ): Call<WeatherResponse>

}