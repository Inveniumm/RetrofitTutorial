package com.invenium.retrofittutorial.categories

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.invenium.retrofittutorial.R
import com.invenium.retrofittutorial.databinding.FragmentCategoriesBinding
import com.invenium.retrofittutorial.databinding.FragmentHomeBinding
import com.invenium.retrofittutorial.home.HomeFragmentVM
import com.invenium.retrofittutorial.home.HomeFragmentVMFactory
import com.invenium.retrofittutorial.repository.Repository
import kotlinx.android.synthetic.main.fragment_home.*

class CategoriesFragment : Fragment() {

    private lateinit var binding: FragmentCategoriesBinding

    private lateinit var viewModel: HomeFragmentVM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCategoriesBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val repository = Repository()
        val viewModelFactory = HomeFragmentVMFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory)[HomeFragmentVM::class.java]

        binding.animalBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_animalFragment)
        }

        binding.careerBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_careerFragment)
        }

        binding.celebrityBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_celebrityFragment)
        }

        binding.devBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_devFragment)
        }
        binding.explicitBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_explicitFragment)
        }
        binding.fashionBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_fashionFragment)
        }
        binding.foodBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_foodFragment)
        }
        binding.historyBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_historyFragment)
        }
        binding.moneyBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_moneyFragment)
        }
        binding.movieBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_movieFragment)
        }
        binding.musicBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_musicFragment)
        }
        binding.politicalBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_politicalFragment)
        }
        binding.religionBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_religionFragment)
        }
        binding.scienceBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_scienceFragment)
        }
        binding.sportBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_sportFragment)
        }
        binding.travelBtn.setOnClickListener{
            findNavController().navigate(R.id.action_categoriesFragment_to_travelFragment)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)

    }

}