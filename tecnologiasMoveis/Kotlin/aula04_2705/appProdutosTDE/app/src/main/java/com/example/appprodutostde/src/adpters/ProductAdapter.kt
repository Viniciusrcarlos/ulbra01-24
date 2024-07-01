package com.example.appprodutostde.src.adpters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appprodutostde.R
import com.example.appprodutostde.src.core.extensions.convertToMoneyWithSymbol
import com.example.appprodutostde.src.core.extensions.formatCurrency
import com.example.appprodutostde.src.core.models.Product
import com.example.appprodutostde.src.view_models.MainViewModel

class ProductAdapter(
    private val items: MutableList<Product>,
    private val goToDetail: (item: Product) -> Unit

) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context

        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.rootView.setOnClickListener {
            goToDetail(items[position])
        }

        holder.itemView.rootView.setOnLongClickListener {
            showPopUpMenu(holder.itemView, position)
            true
        }

        holder.priceProduct.text = items[position].price.formatCurrency()
        holder.nameProduct.text = items[position].name
        holder.descriptionProduct.text = items[position].description

        Glide.with(context).load(items[position].urlImage).into(holder.imageProduct)
    }

    override fun getItemCount(): Int {
        return items.size
    }
    inner class ViewHolder(view: View ): RecyclerView.ViewHolder(view) {
        val imageProduct: ImageView = view.findViewById(R.id.imgProduct)
        val nameProduct: TextView = view.findViewById(R.id.productName)
        val priceProduct: TextView = view.findViewById(R.id.productPrice)
        val descriptionProduct: TextView = view.findViewById(R.id.description)
    }

    private fun showPopUpMenu(view: View, position: Int) {
        PopupMenu(context, view).apply {
            setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.deletar -> {
                        removeItem(items[position])
                        true
                    }
                    else -> false
                }
            }
            inflate(R.menu.menu_popup)
            show()
        }
    }

    private fun removeItem(product: Product) {
        MainViewModel().removeItem(product)
        notifyDataSetChanged()
    }




}