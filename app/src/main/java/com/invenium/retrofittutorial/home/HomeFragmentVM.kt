package com.invenium.retrofittutorial.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.invenium.retrofittutorial.model.Post
import com.invenium.retrofittutorial.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class HomeFragmentVM(private val repository: Repository) : ViewModel() {

    val myResponse: MutableLiveData<Response<Post>> = MutableLiveData()

    fun getPost(){
        viewModelScope.launch {
            val response = repository.getPost()
            myResponse.value = response
        }
    }
}