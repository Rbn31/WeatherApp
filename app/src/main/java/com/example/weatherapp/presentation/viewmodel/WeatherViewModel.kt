package com.example.weatherapp.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapp.data.remote.models.WeatherResponse
import com.example.weatherapp.data.repository.WeatherRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WeatherViewModel : ViewModel() {
    private val repository = WeatherRepository.WeatherRepository()
    val weatherAlerts = MutableLiveData<List<Any>>()
    val error = MutableLiveData<String>()

    fun fetchWeatherAlerts(location: String) {
        repository.getWeatherAlerts(location).enqueue(object : Callback<WeatherResponse> {
            override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
                if (response.isSuccessful) {
                    weatherAlerts.postValue(response.body()?.alerts?.alertList)
                } else {
                    error.postValue("Error: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                error.postValue("Connection has failed: ${t.message}")
            }
        })
    }
}