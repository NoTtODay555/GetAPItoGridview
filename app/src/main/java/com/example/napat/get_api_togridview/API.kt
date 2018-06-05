package com.example.napat.get_api_togridview

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import java.net.URL


interface API {

    interface Movieserver {
        @GET("movie/")
        fun listRepos(@Path("title") title: String): Call<List<Movie_list>>
    }
}