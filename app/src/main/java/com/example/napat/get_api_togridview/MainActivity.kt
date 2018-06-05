package com.example.napat.get_api_togridview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Retrofit



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val retrofit = Retrofit.Builder()
                .baseUrl("https://workshopup.herokuapp.com/")
                .build()

        val service = retrofit.create<API>(API::class.java!!)git
    }

}
