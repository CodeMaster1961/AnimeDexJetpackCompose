package com.example.animedexjetpackcompose.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Weight(
    @SerializedName("Part I")
    val partI: String,
    @SerializedName("Part II")
    val partII: String
)