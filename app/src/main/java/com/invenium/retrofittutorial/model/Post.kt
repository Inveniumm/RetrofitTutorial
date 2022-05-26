package com.invenium.retrofittutorial.model

import com.google.gson.annotations.SerializedName

data class Post(
    val icon_url: String,
    val url: String,
    val value: String
)