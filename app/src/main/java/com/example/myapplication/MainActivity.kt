package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.myapplication.viewmodel.BookViewModel

class MainActivity : AppCompatActivity() {

    private val bookViewModel: BookViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bookViewModel.fetchAllBooks() // Gọi API lấy danh sách sách

        bookViewModel.bookAllLiveData.observe(this, Observer { books ->
            Log.d("API_RESPONSE", "Danh sách sách: ${books.data}")
        })

        bookViewModel.fetchOneBooks(1)
        bookViewModel.bookOneLiveData.observe(this, Observer { book ->
            Log.d("API_RESPONSE", "Thông tin sách: $book")
        })
    }
}
