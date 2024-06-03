package com.example.appprodutostde.src.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.appprodutostde.R
import com.example.appprodutostde.src.adpters.ProductAdapter
import com.example.appprodutostde.src.view_models.MainViewModel

class HomeFragment : Fragment() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler = view.findViewById<RecyclerView>(R.id.recycler)

        viewModel.productList.observe(viewLifecycleOwner, Observer {
            val productAdapter = ProductAdapter(it) { product ->
                val bundle = bundleOf("data" to product)
                view.findNavController().navigate(R.id.action_homeFragment_to_productDetailFragment, bundle)
            }
            recycler.adapter = productAdapter
        })
    }
}
