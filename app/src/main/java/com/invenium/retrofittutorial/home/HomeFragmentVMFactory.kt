package com.invenium.retrofittutorial.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.invenium.retrofittutorial.repository.Repository

class HomeFragmentVMFactory(
    private val repository: Repository
) : ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return HomeFragmentVM(repository) as T
    }

}