package com.example.pokeapi.view

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokeapi.domain.Pokemon

class PokemonAdapter(val items: List<Pokemon>) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView() {

        }
    }
}