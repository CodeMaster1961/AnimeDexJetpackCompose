package com.example.animedexjetpackcompose.data.remote.responses


import com.google.gson.annotations.SerializedName

data class NinjaRank(
    @SerializedName("Blank Period")
    val blankPeriod: String,
    @SerializedName("Gaiden")
    val gaiden: String,
    @SerializedName("Part I")
    val partI: String,
    @SerializedName("Part II")
    val partII: String
)