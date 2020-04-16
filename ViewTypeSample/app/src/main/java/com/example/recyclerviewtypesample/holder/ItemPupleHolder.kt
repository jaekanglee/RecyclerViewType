package com.example.recyclerviewtypesample.holder

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtypesample.data.Model
import com.example.recyclerviewtypesample.databinding.ItemType07Binding

class ItemPupleHolder(var binding: ItemType07Binding) : RecyclerView.ViewHolder(binding.root) {


    fun bind(item: Model.Item?) {
        item?.let {
            // Todo Your job
        }
    }

}