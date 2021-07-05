package com.riuta.recyclerswipe2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class SwipeAdapter(private val context: Context): RecyclerView.Adapter<SwipeAdapter.SwipeViewHolder>() {

    inner class SwipeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val sogeking: ImageView = itemView.findViewById(R.id.button_sogeking)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SwipeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_swipe_recycler, parent, false)
        return SwipeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SwipeViewHolder, position: Int) {

        holder.sogeking.setOnClickListener {
            Toast.makeText(context, "そげキング", Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int = 3
}
