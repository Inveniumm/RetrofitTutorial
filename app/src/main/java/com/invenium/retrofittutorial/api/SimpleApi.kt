package com.invenium.retrofittutorial.api

import com.invenium.retrofittutorial.model.Post
import retrofit2.http.GET

interface SimpleApi {

    @GET("post/1")
    suspend fun getPost(): Post
}