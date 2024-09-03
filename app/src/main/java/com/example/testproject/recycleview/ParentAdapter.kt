package com.example.testproject.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testproject.recycleview.databinding.ParentlayoutBinding

class ParentAdapter(private val parentModal: List<ParentModal>) :
    RecyclerView.Adapter<ParentAdapter.ParentViewHolder>() {
    class ParentViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val binding=ParentlayoutBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
        val vview = LayoutInflater.from(parent.context).inflate(R.layout.parentlayout, parent, false)
        return ParentViewHolder(vview)
    }

    override fun getItemCount()=parentModal.size
    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {

        holder.binding.apply {
            val parentModal=parentModal[position]
            tvGeneratiorMovie.text=parentModal.tittle
            val childAdapter=ChildAdapter(parentModal.movieModals)
            parenttt.adapter=childAdapter
        }
    }

}