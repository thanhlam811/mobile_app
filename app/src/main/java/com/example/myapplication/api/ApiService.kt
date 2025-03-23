import com.example.myapplication.model.BookResponse
import retrofit2.http.GET

interface ApiService {
    @GET("api/books/2") // Gọi API lấy 1 cuốn sách
    suspend fun getBook(): BookResponse
}