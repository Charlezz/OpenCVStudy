package com.charlezz.opencvstudy.ui

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView

open class ViewBindingHolder<VDB : ViewDataBinding> (val binding:VDB): RecyclerView.ViewHolder(binding.root) {

}