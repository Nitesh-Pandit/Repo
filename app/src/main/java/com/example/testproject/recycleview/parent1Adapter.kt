package com.example.testproject.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class parent1Adapter(private var parentList: List<parent1Modal>):RecyclerView.Adapter<parent1Adapter.parent1ViewHolder>() {
    class parent1ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val Ptext:TextView=itemView.findViewById(R.id.parentText)
        val Pimage:ImageView=itemView.findViewById(R.id.parentImage)
        val Precycleview:RecyclerView=itemView.findViewById(R.id.parentRecycle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): parent1ViewHolder {
        val intt=LayoutInflater.from(parent.context).inflate(R.layout.parent1layout,parent,false,)
        return parent1ViewHolder(intt)
    }

    override fun getItemCount(): Int {
        return parentList.size
    }

    override fun onBindViewHolder(holder: parent1ViewHolder, position: Int) {
        val paretnItem=parentList[position]
        holder.Pimage.setImageResource(paretnItem.Logo)
        holder.Ptext.text=paretnItem.header

        holder.Precycleview.setHasFixedSize(true)
        holder.Precycleview.layoutManager=GridLayoutManager(holder.itemView.context,3)
        val adapter=child1Adapter(paretnItem.mlist)
        holder.Precycleview.adapter=adapter
    }

}