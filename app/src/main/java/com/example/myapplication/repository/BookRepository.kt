package com.example.myapplication.repository

import com.example.myapplication.model.Book
import com.example.myapplication.model.BookData
import com.example.myapplication.model.BookGetOneResponse
import com.example.myapplication.network.RetrofitInstance

class BookRepository {
    suspend fun getAllBooks(): BookData {
        return RetrofitInstance.api.getAllBooks().data // Trả về danh sách sách
    }

    suspend fun getOneBooks(bookId: Int): BookGetOneResponse {
        return RetrofitInstance.api.getOneBooks(bookId) // Trả về 1 quyển sách
    }
}
