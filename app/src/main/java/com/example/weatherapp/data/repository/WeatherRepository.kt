package com.example.weatherapp.data.repository

import com.example.weatherapp.data.remote.models.WeatherResponse
import com.example.weatherapp.data.remote.RetrofitClient
import retrofit2.Call

class WeatherRepository {

    class WeatherRepository {
        private val apiService = RetrofitClient.RetrofitClient.apiService

        fun getWeatherAlerts(location: String): Call<WeatherResponse> {
            return apiService.getWeatherAlerts(
                apiKey = "def243776emshfdf471796d80ccep18a20fjsnbab6f74b3ef2",
                apiHost = "weatherapi-com.p.rapidapi.com",
                location = location
            )
        }
    }
}