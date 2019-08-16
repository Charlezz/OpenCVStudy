package com.charlezz.opencvstudy.ui

import android.databinding.ViewDataBinding

class ViewModelHolder<VDB:ViewDataBinding, T>(binding:VDB, val variableId : Int) : ViewBindingHolder<VDB>(binding){
    var viewModel : T? = null
    set(value) {
        binding.setVariable(variableId, value)
        binding.executePendingBindings()
    }

}
