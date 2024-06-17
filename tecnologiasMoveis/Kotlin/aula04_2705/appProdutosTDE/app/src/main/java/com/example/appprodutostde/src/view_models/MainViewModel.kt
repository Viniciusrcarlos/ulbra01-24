package com.example.appprodutostde.src.view_models

import android.net.Uri
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appprodutostde.src.core.models.Product
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.StorageTask
import com.google.firebase.storage.UploadTask
import com.google.firebase.storage.ktx.storage

class MainViewModel : ViewModel() {
    private val db = Firebase.firestore
    private val _productList = MutableLiveData<MutableList<Product>>()
    val productList: LiveData<MutableList<Product>> = _productList

    init {
        fetchData()
    }

    private fun fetchData() {
        db.collection("products")
            .addSnapshotListener { snapshot, error ->
                if (error != null) {
                    return@addSnapshotListener
                }

                snapshot?.let { it ->
                    val products = mutableListOf<Product>()
                    for (document in it.documents) {
                        val product = document.toObject<Product>()
                        product?.let {
                            products.add(it)
                        }
                    }
                    _productList.value = products
                }
            }
    }

    fun removeItem(product: Product) {
        val productId = product.uuid

        db.collection("products").document(productId)
            .delete()
            .addOnSuccessListener {
            }
            .addOnFailureListener { e ->
            }
    }

    fun addItem(product: Product) {
        db.collection("products")
            .add(product)
            .addOnSuccessListener { documentReference ->
                db.collection("products").document(documentReference.id)
                    .update("uuid", documentReference.id)
                    .addOnSuccessListener {
                    }
                    .addOnFailureListener { e ->
                    }
            }
            .addOnFailureListener { e ->
            }

    }

    fun addPhotoStorage(uri: Uri, callback: (String?) -> Unit) {
        val storageRef = Firebase.storage.reference
        val imageRef = storageRef.child("images/${uri.lastPathSegment}")

        val uploadTask: UploadTask = imageRef.putFile(uri)

        uploadTask.addOnFailureListener {
            // Handle unsuccessful uploads
            callback(null)
        }.addOnSuccessListener {
            // Get the download URL
            imageRef.downloadUrl.addOnSuccessListener { uri ->
                callback(uri.toString())
            }.addOnFailureListener {
                callback(null)
            }
        }
    }


    override fun onCleared() {
        super.onCleared()
        db.clearPersistence()
    }
}
