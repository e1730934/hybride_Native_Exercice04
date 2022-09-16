package com.applicationhybride.exercice04.adapters

import Pokemon
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.applicationhybride.exercice04.R
import com.squareup.picasso.Picasso

class PokemonRVAdapter(private val listPokemon: MutableList<Pokemon>) :
    RecyclerView.Adapter<PokemonRVAdapter.PokemonViewHolder>() {

    class PokemonViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.carte_pokemon, parent, false) as View
        return PokemonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.view.findViewById<TextView>(R.id.txtPokemonName).text =
            listPokemon[position].name
        val imgPokemon = holder.view.findViewById<ImageView>(R.id.imgPokemon)
        Picasso.get().load(listPokemon[position].imgURL).into(imgPokemon)
    }

    override fun getItemCount() = this.listPokemon.size
}

