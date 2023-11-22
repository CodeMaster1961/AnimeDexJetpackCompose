package com.example.animedexjetpackcompose.repository

import com.example.animedexjetpackcompose.data.remote.AnimeApi
import com.example.animedexjetpackcompose.data.remote.responses.AnimeCharacters
import com.example.animedexjetpackcompose.data.remote.responses.Character
import com.example.animedexjetpackcompose.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class AnimeRepository @Inject constructor(
    private val api: AnimeApi
) {


    suspend fun getAnimeList(limit: Int): Resource<AnimeCharacters> {
        val response = try {
            api.getAnimeList(limit)
        } catch (error: Exception) {
            return Resource.Error("An Unknown Error has ocurred")
        }
        return Resource.Success(response)
    }

    suspend fun getAnimeInfo(name: String): Resource<Character> {
        val response = try {
            api.getAnimeInfo(name)
        } catch (error: Exception) {
            return Resource.Error("An Unknown Error has ocurred")
        }
        return Resource.Success(response)
    }

}