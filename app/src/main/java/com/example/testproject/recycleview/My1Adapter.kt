package com.example.testproject.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class My1Adapter(private var newList: ArrayList<new>):RecyclerView.Adapter<My1Adapter.My1ViewHolder>(){
    class My1ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val titleImage: ImageView =itemView.findViewById(R.id.imageView)
        val tvHeading: TextView =itemView.findViewById(R.id.textView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): My1ViewHolder {
        val ItemViiew=LayoutInflater.from(parent.context).inflate(R.layout.item_listtt,parent,false)
        return My1ViewHolder(ItemViiew)
    }

    override fun onBindViewHolder(holder: My1Adapter.My1ViewHolder, position: Int) {
            val currentItem=newList[position]
            holder.titleImage.setImageResource(currentItem.imageeView)
            holder.tvHeading.text=currentItem.header
    }

    override fun getItemCount(): Int {
       return newList.size
    }

}