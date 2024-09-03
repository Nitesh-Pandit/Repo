package com.example.testproject.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testproject.recycleview.databinding.ChildlayoutBinding

class ChildAdapter(private var childModal: List<Int>):RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {
  inner  class ChildViewHolder(itemview:View):RecyclerView.ViewHolder(itemview) {
        val binding=ChildlayoutBinding.bind(itemview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.childlayout,parent,false)
        return ChildViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        holder.binding.apply {
            childImage.setImageResource(childModal[position])
        }
    }
    override fun getItemCount()=childModal.size

}