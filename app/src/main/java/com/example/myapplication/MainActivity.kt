package com.example.myapplication

import BookViewModel
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val bookViewModel: BookViewModel by viewModels() // Khởi tạo ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Gọi API khi màn hình mở
        bookViewModel.fetchBook()
    }
}
