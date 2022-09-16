package com.applicationhybride.exercice04.viewmodels.pokemon

import Pokemon
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.applicationhybride.exercice04.repositories.PokemonRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PokemonViewModel(application: Application): AndroidViewModel(application) {

    public val pokemon: MutableLiveData<MutableList<Pokemon>> = MutableLiveData(mutableListOf())
    init {
        viewModelScope.launch(Dispatchers.IO) {
            val pokemonRepository = PokemonRepository(getApplication())
            pokemonRepository.getPokemons(pokemon)
            }
        }
    }


