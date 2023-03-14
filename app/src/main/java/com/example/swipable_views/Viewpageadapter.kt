package com.example.swipable_views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view_pager.view.*

class Viewpageadapter (val images: List<Int>) : RecyclerView.Adapter<Viewpageadapter.ViewpageViewHolder>()
{
    inner class ViewpageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewpageViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager,parent,false)
        return ViewpageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: ViewpageViewHolder, position: Int) {
    val curImage = images[position]
        holder.itemView.ivImage.setImageResource(curImage)
    }
    
}
