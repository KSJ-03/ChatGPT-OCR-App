package com.google.mlkit.vision.demo.kotlin.api

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ChatGptInterface {

    // to make GET parameter an END_POINT
    @GET("api/hello/{question}")
    fun getResponse(@Path("question") question: String): Call<JsonObject>
}