package com.invenium.retrofittutorial.repository

import com.invenium.retrofittutorial.api.RetrofitInstance
import com.invenium.retrofittutorial.model.Post

class Repository {

    suspend fun getPost() : Post{
        return RetrofitInstance.api.getPost()
    }

}