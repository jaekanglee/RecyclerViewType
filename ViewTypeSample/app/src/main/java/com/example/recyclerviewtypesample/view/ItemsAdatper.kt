package com.example.recyclerviewtypesample.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtypesample.data.Model
import com.example.recyclerviewtypesample.databinding.*
import com.example.recyclerviewtypesample.holder.*

class ItemsAdatper(private var items: ArrayList<Model.Item>?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    //각 뷰타입 별 분기 -> 다른 홀더와 다른 Layout을 Inflate해줌
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            TYPE_RE -> {
                var binding =
                    ItemType01Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ItemRedHolder(
                    binding
                )
            }
            TYPE_OR -> {
                var binding =
                    ItemType02Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ItemOrangeHolder(
                    binding
                )
            }
            TYPE_YELL -> {
                var binding =
                    ItemType03Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ItemYellowHolder(
                    binding
                )
            }
            TYPE_GR -> {
                var binding =
                    ItemType04Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ItemGreenHolder(
                    binding
                )
            }
            TYPE_BL -> {
                var binding =
                    ItemType05Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ItemBlueHolder(
                    binding
                )
            }
            TYPE_DEPPBL -> {
                var binding =
                    ItemType06Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ItemDBlueHolder(
                    binding
                )
            }
            TYPE_PU -> {
                var binding =
                    ItemType07Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ItemPupleHolder(
                    binding
                )
            }
            else -> {
                var binding =
                    ItemType01Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ItemRedHolder(
                    binding
                )
            }

        }
    }

    // 어댑터가 전달받은 리스트 사이즈 반환 , Null일땐 0
    override fun getItemCount(): Int {
        return items?.size ?: 0
    }

    //홀더 타입에 따라 뷰와 바인딩 해줌
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ItemRedHolder) {
            holder.bind(items?.get(position))
        } else if (holder is ItemOrangeHolder) {
            holder.bind(items?.get(position))
        } else if (holder is ItemYellowHolder) {
            holder.bind(items?.get(position))
        } else if (holder is ItemGreenHolder) {
            holder.bind(items?.get(position))
        } else if (holder is ItemBlueHolder) {
            holder.bind(items?.get(position))
        } else if (holder is ItemDBlueHolder) {
            holder.bind(items?.get(position))
        } else if (holder is ItemPupleHolder) {
            holder.bind(items?.get(position))
        }
    }

    //각 아이템의 Viewtype을 반환함 여기서 반환 된 VieType-> onCreateViewHolder로 넘어감
    override fun getItemViewType(position: Int): Int {
        items?.let {
            return it[position].viewType
        } ?: kotlin.run {
            return super.getItemViewType(position)
        }
    }


    //뷰타입 종류
    companion object {
        const val TYPE_RE = 1;
        const val TYPE_OR = 2;
        const val TYPE_YELL = 3;
        const val TYPE_GR = 4;
        const val TYPE_BL = 5;
        const val TYPE_DEPPBL = 6;
        const val TYPE_PU = 7;

    }

}