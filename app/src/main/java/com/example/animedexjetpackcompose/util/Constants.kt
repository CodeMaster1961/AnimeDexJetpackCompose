package com.example.animedexjetpackcompose.util

import com.example.animedexjetpackcompose.data.remote.AnimeApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Constants {
    const val BASE_URL = "https://dattebayo-api.onrender.com/"
}

object RetrofitInstance {
    private const val BASE_URL = "https://dattebayo-api.onrender.com/"

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: AnimeApi by lazy {
        retrofit.create(AnimeApi::class.java)
    }
}
