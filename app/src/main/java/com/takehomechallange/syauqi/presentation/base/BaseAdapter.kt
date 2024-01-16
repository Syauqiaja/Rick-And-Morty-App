package com.takehomechallange.syauqi.presentation.base

import android.annotation.SuppressLint
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.facebook.shimmer.Shimmer
import com.facebook.shimmer.ShimmerDrawable

open class BaseAdapter<B: ViewBinding, T>(
    private val inflateMethod : (ViewGroup, Int) -> B,

    ): RecyclerView.Adapter<BaseAdapter<B, T>.ListViewHolder>() {
    private val _listData = ArrayList<T>()
    var onItemClick : ((T) -> Unit)? = null
    fun setData(datas: List<T>){
        notifyItemRangeRemoved(0, _listData.size);
        _listData.clear()
        _listData.addAll(datas)
        notifyItemRangeInserted(0,_listData.size)
    }
    open fun bindView(data: T, binding: B, itemView: View){}
    @SuppressLint("SuspiciousIndentation")
    inner class ListViewHolder(private val binding: B): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: T){
            bindView(data, binding, itemView)
        }
        init {
            if(onItemClick != null)
                binding.root.setOnClickListener {
                    onItemClick?.invoke(_listData[adapterPosition])
                }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(inflateMethod.invoke(parent, viewType))
    }

    override fun getItemCount(): Int = _listData.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(_listData[position])
    }
}