package com.example.testproject.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView


class MyAdapter(private val newsList:ArrayList<News>):
    RecyclerView.Adapter<MyAdapter.MyviewHolder>() {
    class MyviewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val titleImage:ShapeableImageView=itemView.findViewById(R.id.shapeableImageView)
        val tvHeading:TextView=itemView.findViewById(R.id.textView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyviewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.list_items,parent,false)
        return MyviewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyAdapter.MyviewHolder, position: Int) {
        val currentItem=newsList[position]
        holder.titleImage.setImageResource(currentItem.titleName)
        holder.tvHeading.text=currentItem.heading
    }
    override fun getItemCount(): Int {
       return newsList.size
    }
}