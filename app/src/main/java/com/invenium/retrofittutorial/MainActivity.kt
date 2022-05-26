package com.invenium.retrofittutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.invenium.retrofittutorial.repository.Repository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]

        findViewById<Button>(R.id.button).setOnClickListener{
            viewModel.getPost()
        }
        viewModel.myResponse.observe(this, Observer {response ->
            if(response.isSuccessful) {
                titleValue.setText(response.body()?.url!!)
                textValue.setText(response.body()?.value!!)
            }else{
                Log.d("Response", response.errorBody().toString())
            }

        })

    }
}