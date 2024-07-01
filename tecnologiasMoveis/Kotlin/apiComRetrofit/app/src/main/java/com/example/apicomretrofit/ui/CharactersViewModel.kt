package com.example.apicomretrofit.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apicomretrofit.data.Character
import com.example.apicomretrofit.data.repositories.CharactersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(private val charactersRepository: CharactersRepository): ViewModel() {

    fun fetchCharacters(): LiveData<List<Character>> {
        val liveData = MutableLiveData<List<Character>>()
        viewModelScope.launch(Dispatchers.IO) {
            val result = charactersRepository.fetchCharacters()
            liveData.postValue(result)
        }

        return liveData
    }


}