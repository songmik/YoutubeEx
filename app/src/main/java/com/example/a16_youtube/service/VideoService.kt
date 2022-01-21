package com.example.a16_youtube.service

import com.example.a16_youtube.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/79483352-ae72-4a28-b380-8cd1294b8452")
    fun listVideos(): Call<VideoDto>

}