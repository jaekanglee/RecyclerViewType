package com.example.recyclerviewtypesample.holder

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtypesample.data.Model
import com.example.recyclerviewtypesample.databinding.ItemType02Binding

class ItemOrangeHolder(var binding: ItemType02Binding) : RecyclerView.ViewHolder(binding.root) {


    fun bind(item : Model.Item?){
        item?.let {
            // Todo Your job
        }
    }

}