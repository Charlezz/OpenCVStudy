package com.charlezz.opencvstudy.ui

import android.support.v7.widget.RecyclerView

abstract class ViewModelAdapter<T> : RecyclerView.Adapter<ViewModelHolder<*,T>>() {
    var viewModels: ArrayList<T> = ArrayList()
    set(value) {
        synchronized(this.viewModels){
            this.viewModels.clear()
            this.viewModels.addAll(value)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount() = viewModels.size

    override fun onBindViewHolder(holder: ViewModelHolder<*, T>, position: Int) {
        holder.viewModel = getItem(position)
    }

    fun getItem(position:Int)= viewModels[position]



}