package com.example.appprodutostde

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

class ProductDetailFragment : Fragment() {

    private lateinit var bottomNavigationView: View
    private lateinit var toolbar: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_product_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val productBundle = arguments?.getSerializable("data") as? Product
        val image = view.findViewById<ImageView>(R.id.imgProduct)
        val btnBack = view.findViewById<View>(R.id.btnBack)
        val price = view.findViewById<TextView>(R.id.productPrice)
        val name = view.findViewById<TextView>(R.id.productName)

        bottomNavigationView = requireActivity().findViewById(R.id.menu_bottom)
        toolbar = requireActivity().findViewById(R.id.toolbar)

        bottomNavigationView.visibility = View.GONE
        toolbar.visibility = View.GONE

        price.text = productBundle?.price
        name.text = productBundle?.name

        Glide.with(this).load(productBundle?.urlImage).centerCrop().into(image)

        btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        bottomNavigationView.visibility = View.VISIBLE
        toolbar.visibility = View.VISIBLE
    }
}
