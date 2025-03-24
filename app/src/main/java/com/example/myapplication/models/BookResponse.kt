package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

data class BookGetOneResponse(
    @SerializedName("statusCode") val statusCode: Int,
    @SerializedName("error") val error: String?,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: Book // `data` chứa 1 cuốn sách
)

data class BookAllResponse(
    @SerializedName("statusCode") val statusCode: Int,
    @SerializedName("error") val error: String?,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: BookData// Danh sách sách
)