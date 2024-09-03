package com.example.testproject.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class child1Adapter(private val childList:List<child1Modal>):RecyclerView.Adapter<child1Adapter.child1ViewHolder>(){
    class child1ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val logo:ImageView=itemView.findViewById(R.id.childImage)
        var tittle:TextView=itemView.findViewById(R.id.childView)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): child1Adapter.child1ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.child1layout,parent,false)
        return child1ViewHolder(view)
    }

    override fun onBindViewHolder(holder: child1Adapter.child1ViewHolder, position: Int) {
        holder.logo.setImageResource(childList[position].Imageview)
        holder.tittle.text=childList[position].textview
    }

    override fun getItemCount(): Int {
       return childList.size
    }

}