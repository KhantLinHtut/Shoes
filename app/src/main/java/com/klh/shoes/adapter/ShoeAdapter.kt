package com.klh.shoes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.klh.shoes.R
import com.klh.shoes.model.Shoes
import kotlinx.android.synthetic.main.shoe_list.view.*

class ShoeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var shoeName = itemView.findViewById<TextView>(R.id.txt_name)
    var shoeType = itemView.findViewById<TextView>(R.id.txt_type)
    var shoePrice = itemView.findViewById<TextView>(R.id.txt_price)
    var shoeImage = itemView.findViewById<ImageView>(R.id.img_shoe)
}

class ShoeAdapter(val shoeList: ArrayList<Shoes>) : RecyclerView.Adapter<ShoeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shoe_list, parent, false)
        return ShoeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shoeList.size
    }

    override fun onBindViewHolder(holder: ShoeViewHolder, position: Int) {
        holder.shoeName.text = shoeList[position].name
        holder.shoeType.text = shoeList[position].type
        holder.shoePrice.text = shoeList[position].price.toString()
        holder.shoeImage.setImageResource(shoeList[position].img)
    }

}