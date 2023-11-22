package com.example.animedexjetpackcompose.DI

import com.example.animedexjetpackcompose.data.remote.AnimeApi
import com.example.animedexjetpackcompose.repository.AnimeRepository
import com.example.animedexjetpackcompose.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideAnimeRepository(
        api: AnimeApi
    ) = AnimeRepository(api)

    @Singleton
    @Provides
    fun provideAnimeApi(): AnimeApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(AnimeApi::class.java)
    }
}