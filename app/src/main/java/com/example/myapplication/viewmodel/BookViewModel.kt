package com.example.myapplication.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.model.Book
import com.example.myapplication.model.BookData
import com.example.myapplication.network.RetrofitInstance
import kotlinx.coroutines.launch

class BookViewModel : ViewModel() {

    val bookAllLiveData = MutableLiveData<BookData>() // Lưu danh sách sách
    val bookOneLiveData = MutableLiveData<Book>()

    fun fetchAllBooks() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getAllBooks() // Gọi API
                val books: BookData = response.data // Lấy danh sách sách từ API
                Log.d("API_RESPONSE", "Nhận được danh sách sách: ${books.data}")
            } catch (e: Exception) {
                Log.e("API_ERROR", "Lỗi khi gọi API: ${e.message}")
            }
        }
    }
    fun fetchOneBooks(bookId: Int) {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getOneBooks(bookId) // Gọi API
                val books: Book = response.data // Lấy danh sách sách từ API
                Log.d("API_RESPONSE", "Nhận: $books")
            } catch (e: Exception) {
                Log.e("API_ERROR", "Lỗi khi gọi API: ${e.message}")
            }
        }
    }
}
