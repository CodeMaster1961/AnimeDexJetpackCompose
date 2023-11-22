package com.example.animedexjetpackcompose.data.remote.responses


import com.google.gson.annotations.SerializedName

data class VoiceActors(
    @SerializedName("english")
    val english: List<String>,
    @SerializedName("japanese")
    val japanese: List<String>
)