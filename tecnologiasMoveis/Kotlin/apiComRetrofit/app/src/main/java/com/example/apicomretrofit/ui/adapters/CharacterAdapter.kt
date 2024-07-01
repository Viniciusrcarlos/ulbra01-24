package com.example.apicomretrofit.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.ulbra.apicomretrofit.databinding.CharacterItemBinding
import com.example.apicomretrofit.data.Character

class CharacterAdapter : RecyclerView.Adapter<CharacterAdapter.ViewRolder>() {

     private lateinit var binding: CharacterItemBinding
    private lateinit var context: Context
    private var listCharacters: List<Character> = emptyList()

    fun setUpCharacters(characters: List<Character>) {
        this.listCharacters = characters
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewRolder {
        context = parent.context
        binding = CharacterItemBinding.inflate(LayoutInflater.from(context), parent, false)

        return ViewRolder(binding)
    }

    override fun getItemCount(): Int = listCharacters.size

    override fun onBindViewHolder(holder: ViewRolder, position: Int) {
        holder.bind(listCharacters[position])
        binding.executePendingBindings()
    }

    inner class ViewRolder(private val bindingHolder: CharacterItemBinding): RecyclerView.ViewHolder(bindingHolder.root) {
        fun bind(character: Character) {
            bindingHolder.character = character
        }
    }
}
