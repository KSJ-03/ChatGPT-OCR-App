package com.google.mlkit.vision.demo.kotlin.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

//        val BASE_URL = "http://10.0.2.2:5000"
//    val BASE_URL = "https://chatgpt2.centralindia.cloudapp.azure.com"
//    val BASE_URL = "http://127.0.0.1:5000"
    val BASE_URL = "https://0474-2405-201-6007-40f9-5d24-c244-7225-4ebc.ngrok-free.app/"
//    using ngrok as I am out of free credits provided by microsoft azure through github student developer pack
    fun getInstance(): Retrofit {
        val retrofit: Retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create()) // Gson - a JSON serialization/deserialization library. Responsible for converting your Kotlin or Java objects to JSON when sending requests and vice versa when receiving responses.
            .baseUrl(BASE_URL)
            .build()
        return retrofit
    }
}