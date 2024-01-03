package com.google.mlkit.vision.demo.kotlin.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    //    val BASE_URL = "http://10.0.2.2:5000"
    val BASE_URL = "https://chatgpt2.centralindia.cloudapp.azure.com"
    fun getInstance(): Retrofit {
        val retrofit: Retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create()) // Gson - a JSON serialization/deserialization library. Responsible for converting your Kotlin or Java objects to JSON when sending requests and vice versa when receiving responses.
            .baseUrl(BASE_URL)
            .build()
        return retrofit
    }
}