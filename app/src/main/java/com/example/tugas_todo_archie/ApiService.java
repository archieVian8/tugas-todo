package com.example.tugas_todo_archie;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("todo.php")
    Call<List<TodoItem>> getTodoItems();
}

