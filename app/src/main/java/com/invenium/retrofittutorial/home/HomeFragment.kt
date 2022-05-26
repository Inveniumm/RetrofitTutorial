package com.invenium.retrofittutorial.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.invenium.retrofittutorial.R
import com.invenium.retrofittutorial.databinding.FragmentHomeBinding
import com.invenium.retrofittutorial.repository.Repository
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private lateinit var viewModel: HomeFragmentVM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val repository = Repository()
        val viewModelFactory = HomeFragmentVMFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory)[HomeFragmentVM::class.java]

        binding.randomiserBtn.setOnClickListener{
            viewModel.getPost()
        }

        binding.categoriesBtn.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_categoriesFragment)
        }
        viewModel.myResponse.observe(viewLifecycleOwner, Observer {response ->
            if(response.isSuccessful) {
                titleValue.text = response.body()?.url!!
                textValue.text = response.body()?.value!!
            }else{
                Log.d("Response", response.errorBody().toString())
            }

        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)

        super.onCreate(savedInstanceState)

    }

}