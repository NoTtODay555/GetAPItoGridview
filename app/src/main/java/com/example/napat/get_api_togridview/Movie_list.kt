package com.example.napat.get_api_togridview
import com.google.gson.annotations.SerializedName
import retrofit2.http.Url

data class Movie_list(
        @SerializedName("Titel") val title:String,
        @SerializedName("Image_Url") val image_url:Url,
        @SerializedName("Over_view") val overview : String
)