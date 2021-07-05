package com.riuta.recyclerswipe2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class SwipeAdapter(private val context: Context): RecyclerView.Adapter<SwipeAdapter.SwipeViewHolder>() {

    inner class SwipeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val sogeking: ImageView = itemView.findViewById(R.id.sogeking)
        val catiFram: ImageView = itemView.findViewById(R.id.cati_fram)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SwipeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_swipe_recycler, parent, false)
        return SwipeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SwipeViewHolder, position: Int) {

        holder.sogeking.setOnClickListener {
            Snackbar.make(it, "そげキング", Snackbar.LENGTH_SHORT).show()
        }

        holder.catiFram.setOnClickListener {
            Snackbar.make(it, "カティ・フラム", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = 3
}
