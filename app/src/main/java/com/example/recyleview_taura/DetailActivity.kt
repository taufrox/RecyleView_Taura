package com.example.recyleview_taura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val item = intent.getParcelableExtra<item>(MainActivity.INTENT_PARCILABLE)

        val gambar = findViewById<ImageView>(R.id.img_item_photo)
        val nama = findViewById<TextView>(R.id.tv_item_name)
        val deskripsi = findViewById<TextView>(R.id.tv_item_description)

        gambar.setImageResource(item?.gambar!!)
        nama.text = item.nama
        deskripsi.text = item.deskripsi

    }
}