package com.example.apicomretrofit

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.observe
import br.com.ulbra.apicomretrofit.R
import br.com.ulbra.apicomretrofit.databinding.ActivityMainBinding
import com.example.apicomretrofit.ui.CharactersViewModel
import com.example.apicomretrofit.ui.adapters.CharacterAdapter
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: CharacterAdapter
    private val charactersVielModel: CharactersViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configureRecycler()
        observer()
    }

    private fun configureRecycler() {
        adapter = CharacterAdapter()
        binding.rcCharacters.adapter = adapter
    }

    private fun observer() {
        charactersVielModel.fetchCharacters().observe(this) {
            adapter.setUpCharacters(it)
        }
    }
}