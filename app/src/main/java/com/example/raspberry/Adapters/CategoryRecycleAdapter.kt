package com.example.raspberry.Adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.raspberry.R
import java.util.*

class CategoryRecycleAdapter(val context: Context, val categories: List<Locale.Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
    }

}
