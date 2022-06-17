package com.example.recyleview_taura

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter (private val context: Context, private val item: List<item>, val listener: (item)-> Unit )
    :RecyclerView.Adapter<Adapter.itemViewholder>(){
    class itemViewholder(view: View): RecyclerView.ViewHolder(view) {

        val gambar = view.findViewById<ImageView>(R.id.img_item_photo)
        val nama = view.findViewById<TextView>(R.id.tv_item_name)
        val deskripsi = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindview(item: item, listener: (item) -> Unit){
            gambar.setImageResource(item.gambar)
            nama.text = item.nama
            deskripsi.text = item.deskripsi
            itemView.setOnClickListener{listener(item)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewholder {
        return itemViewholder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: itemViewholder, position: Int) {
        holder.bindview(item[position],listener)
    }

    override fun getItemCount(): Int = item.size

}
