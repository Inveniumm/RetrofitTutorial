package com.invenium.retrofittutorial.api

import com.google.gson.JsonElement
import com.invenium.retrofittutorial.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {

    @GET("random")
    suspend fun getPost(): Response<Post>
}