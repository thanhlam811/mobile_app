package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

data class BookResponse(
    @SerializedName("statusCode") val statusCode: Int,
    @SerializedName("error") val error: String?,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: Book // `data` chứa 1 cuốn sách
)
