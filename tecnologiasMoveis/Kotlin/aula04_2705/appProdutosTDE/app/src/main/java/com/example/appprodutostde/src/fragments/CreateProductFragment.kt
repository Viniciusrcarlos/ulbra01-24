package com.example.appprodutostde.src.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.example.appprodutostde.R
import com.example.appprodutostde.src.view_models.MainViewModel
import com.example.appprodutostde.src.core.models.Product
import com.example.appprodutostde.src.core.extensions.configureToolbar

class CreateProductFragment : Fragment() {
    private val PICK_IMAGE_REQUEST = 1
    private var imageUriGet: String? = null

    private val viewModel: MainViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_create_product, container, false)
    }


    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == AppCompatActivity.RESULT_OK && data != null && data.data != null) {
            val imageUri = data.data
            imageUriGet = imageUri.toString()
            val image = requireView().findViewById<ImageView>(R.id.imgCreatedProduct)
            Glide.with(this).load(imageUri).into(image)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = view.findViewById<EditText>(R.id.etProductName)
        val price = view.findViewById<EditText>(R.id.etProductPrice)
        val description = view.findViewById<EditText>(R.id.etProductDescription)
        val url =
            "https://t3.ftcdn.net/jpg/04/91/00/82/240_F_491008206_6J87meZRmjPYlrTpBEeVzFSm1m3kqOd2.jpg"
        val image = view.findViewById<View>(R.id.imgCreatedProduct)
        image.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(intent, PICK_IMAGE_REQUEST)
        }
        view.findViewById<View>(R.id.btnSave).setOnClickListener {
            if (description.text.toString().isEmpty() || name.text.toString()
                    .isEmpty() || price.text.toString().isEmpty()
            ) {
                Toast.makeText(requireContext(), "Preencha todos os campos", Toast.LENGTH_SHORT)
                    .show()
            } else {
                if (imageUriGet == null) {

                    val product = Product(
                        uuid = "",
                        name = name.text.toString(),
                        price = price.text.toString(),
                        urlImage = url,
                        description = description.text.toString()

                    )
                    viewModel.addItem(product)
                    requireActivity().onBackPressed()
                } else {
                    viewModel.addPhotoStorage(Uri.parse(imageUriGet)) { downloadUrl ->
                        if (downloadUrl != null) {
                            val product = Product(
                                uuid = "",
                                name = name.text.toString(),
                                price = price.text.toString(),
                                urlImage = downloadUrl.toString(),
                                description = description.text.toString()
                            )
                            viewModel.addItem(product)
                        }
                    }
                    requireActivity().onBackPressed()
                }
            }
        }

        (requireActivity() as AppCompatActivity).configureToolbar("Criar Produto", true)
    }

}