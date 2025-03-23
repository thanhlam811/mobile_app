import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.example.myapplication.model.BookResponse
import com.example.myapplication.network.RetrofitInstance


class BookViewModel : ViewModel() {
    fun fetchBook() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getBook() // Lấy dữ liệu từ API
                val book = response.data // Truy xuất book từ response
                Log.d("API_RESPONSE", "Nhận được sách: ${book}")
            } catch (e: Exception) {
                Log.e("API_ERROR", "Lỗi khi gọi API: ${e.message}")
            }
        }
    }
}
