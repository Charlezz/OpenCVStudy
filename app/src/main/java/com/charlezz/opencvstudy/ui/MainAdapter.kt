package com.charlezz.opencvstudy.ui

import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.ViewGroup
import com.charlezz.opencvstudy.BR
import com.charlezz.opencvstudy.R
import com.charlezz.opencvstudy.databinding.ViewMainMenuBinding

class MainAdapter(var handler:OnItemClickHandler<MainMenu>) : ViewModelAdapter<MainMenu>(){


    override fun onCreateViewHolder(viewGroup: ViewGroup, type: Int): ViewModelHolder<*, MainMenu> {
        val layoutInflater = LayoutInflater.from(viewGroup.context)
        val binding = DataBindingUtil.inflate<ViewMainMenuBinding>(layoutInflater, R.layout.view_main_menu, viewGroup, false)
        return ViewModelHolder(binding, BR.viewModel)
    }

    override fun onBindViewHolder(holder: ViewModelHolder<*, MainMenu>, position: Int) {
        super.onBindViewHolder(holder, position)
        holder.binding.setVariable(BR.handler, handler)

    }

}