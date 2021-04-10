package ru.project.parsejson.Client

import retrofit2.Call
import retrofit2.http.GET
import ru.project.parsejson.POJO.Movie

interface RetrofitServices {
    @GET("marvel")
    fun getMovieList(): Call<MutableList<Movie>>
}