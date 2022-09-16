package com.applicationhybride.exercice04.repositories

import Pokemon
import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson

class PokemonRepository(private val application: Application) {
    fun getPokemons(pokemons: MutableLiveData<MutableList<Pokemon>>){
        val queue = Volley.newRequestQueue(application)
        val r = StringRequest(
            Request.Method.GET,
            "https://pokemonsapi.herokuapp.com/pokemons",
            {
                val arrayPokemon = Gson().fromJson(it, Array<Pokemon>::class.java)
                pokemons.postValue(arrayPokemon.toMutableList())
            },
            {
                println("ERREUR: /api/pokemons")
            })
        queue.add(r)
    }
}
