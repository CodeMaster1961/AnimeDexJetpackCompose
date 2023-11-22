package com.example.animedexjetpackcompose.data.remote

import com.example.animedexjetpackcompose.data.remote.responses.AnimeCharacters
import com.example.animedexjetpackcompose.data.remote.responses.Character
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeApi {

    /**
     * this function is for getting a list of anime characters
     * @author Ömer Aynaci
     * @param limit the number of items per page
     * @return a list of anime characters
     */
    @GET("characters")
    suspend fun getAnimeList(
        @Query("limit") limit: Int
    ): AnimeCharacters

    /**
     * this function is for getting a specific anime character by their name
     * @author Ömer Aynaci
     * @param name filters items by name
     * @return info about a specific anime character
     */
    @GET("characters")
    suspend fun getAnimeInfo(
        @Query("name") name: String
    ): Character
}