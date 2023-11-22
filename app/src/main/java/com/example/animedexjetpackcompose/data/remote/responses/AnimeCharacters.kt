package com.example.animedexjetpackcompose.data.remote.responses


import com.google.gson.annotations.SerializedName

data class AnimeCharacters(
    @SerializedName("characters")
    val characters: List<Character>,
    @SerializedName("currentPage")
    val currentPage: Int,
    @SerializedName("pageSize")
    val pageSize: Int,
    @SerializedName("total")
    val total: Int
)