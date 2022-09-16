package com.applicationhybride.exercice04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.applicationhybride.exercice04.adapters.PokemonRVAdapter
import com.applicationhybride.exercice04.viewmodels.pokemon.PokemonViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var rvPokemons: RecyclerView
private lateinit var adapter: PokemonRVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.rvPokemons = findViewById(R.id.rvPokemons)

        val pokemonViewModel = ViewModelProvider(this).get(PokemonViewModel::class.java)
        this.rvPokemons.layoutManager = LinearLayoutManager(this)

        pokemonViewModel.pokemon.observe(this) {
            this.rvPokemons.adapter = PokemonRVAdapter(it)
        }
        rvPokemons.layoutManager = GridLayoutManager(this, 2)

    }
}
