package com.example.testproject.recycleview

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdapter(private var dataList: ArrayList<DataClass>):RecyclerView.Adapter<DataAdapter.Data1Adapter>() {
    class Data1Adapter(Itemview: View):RecyclerView.ViewHolder(Itemview){
        var tittleImage:ImageView=Itemview.findViewById(R.id.shapeImage)
        var tittle:TextView=Itemview.findViewById(R.id.textshape)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Data1Adapter {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.layouttt,parent,false)
        return Data1Adapter(itemView)
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    override fun onBindViewHolder(holder: Data1Adapter, position: Int) {
        val currentItem=dataList[position]
        holder.tittleImage.setImageResource(currentItem.Imagee)
        holder.tittle.text=currentItem.tittle
    }
}