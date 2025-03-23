package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

data class Book(
    @SerializedName("bookId") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("image") val image: String,
    @SerializedName("author") val author: String,
    @SerializedName("isbn") val isbn: String,
    @SerializedName("description") val description: String,
    @SerializedName("descriptionDetails") val descriptionDetails: String,
    @SerializedName("infoDetails") val infoDetails: String,
    @SerializedName("listPrice") val listPrice: Double,
    @SerializedName("sellingPrice") val sellingPrice: Double,
    @SerializedName("quantity") val quantity: Int,
    @SerializedName("avgRate") val avgRate: Double,
    @SerializedName("createdAt") val createdAt: String,
    @SerializedName("createdBy") val createdBy: String,
    @SerializedName("updatedAt") val updatedAt: String,
    @SerializedName("updatedBy") val updatedBy: String
)
