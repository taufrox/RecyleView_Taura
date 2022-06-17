package com.example.recyleview_taura

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCILABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemlist = listOf<item>(
            item(
                R.drawable.jambu,
                "Jambu",
                "buah yang bernama jambu",
            ),
            item(
                R.drawable.sawi,
                "Sawi",
                "Sayur Sawi"
            ),
            item(
                R.drawable.pisang,
                "Pisang",
                "Buah bernama pisang bla bla bla...",
            ),
            item(
                R.drawable.naga,
                "Naga",
                "Buah Naga adalah bla bla bla...."
            )
        )
        val View = findViewById<RecyclerView>(R.id.view_item)
        View.layoutManager = LinearLayoutManager(this)
        View.setHasFixedSize(true)
        View.adapter = Adapter(this, itemlist){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCILABLE,it)
            startActivity(intent)

        }
    }
}