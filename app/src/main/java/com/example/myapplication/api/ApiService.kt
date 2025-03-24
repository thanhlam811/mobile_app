import com.example.myapplication.model.Book
import com.example.myapplication.model.BookAllResponse
import com.example.myapplication.model.BookGetOneResponse
import retrofit2.http.GET
import retrofit2.http.Path

//interface ApiService {
//    @GET("api/books/1") // API lấy danh sách sách
//    suspend fun getBooks(): BookResponse
//}
interface ApiService {
    @GET("api/books") // API lấy danh sách sách
    suspend fun getAllBooks(): BookAllResponse

    @GET("api/books/{id}") // API lấy danh 1 quyển sách
    suspend fun getOneBooks(@Path("id") bookId: Int): BookGetOneResponse
}