package com.invenium.retrofittutorial.repository

import com.invenium.retrofittutorial.api.RetrofitInstance
import com.invenium.retrofittutorial.model.Post
import retrofit2.Response

class Repository {

    suspend fun getPost() : Response<Post>{
        return RetrofitInstance.api.getPost()
    }

}