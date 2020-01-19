package com.klh.shoes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.klh.shoes.adapter.ShoeAdapter
import com.klh.shoes.model.Shoes

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        val shoeArray = ArrayList<Shoes>()
        shoeArray.add(Shoes("Nike", "Air Max 270", 799, R.drawable.shoe1))
        shoeArray.add(Shoes("Jordan", "Air Jordan 11", 1000, R.drawable.shoe2))
        shoeArray.add(Shoes("Puma", "Axelion Running Shoe", 560, R.drawable.shoe3))
        shoeArray.add(Shoes("Adidas", "Super Star", 699, R.drawable.shoe4))
        shoeArray.add(Shoes("Jordan", "Air Jordan 14", 999, R.drawable.shoe5))
        shoeArray.add(Shoes("Jordan", "Air Max 200", 888, R.drawable.shoe6))
        shoeArray.add(Shoes("Nike", "Air Force 1", 1200, R.drawable.shoe7))
        shoeArray.add(Shoes("Nike", "Freak", 870, R.drawable.shoe8))

        val shoeAdapter = ShoeAdapter(shoeArray)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = shoeAdapter
    }
}
