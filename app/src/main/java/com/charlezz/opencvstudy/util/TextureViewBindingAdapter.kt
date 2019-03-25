package com.charlezz.opencvstudy.util

import android.databinding.BindingAdapter
import android.graphics.Matrix
import android.view.TextureView

object TextureViewBindingAdapter{
    @JvmStatic
    @BindingAdapter("transform")
    fun setTransform(view: TextureView, matrix: Matrix?){
        if(matrix!=null){
            view.setTransform(matrix)
        }
    }

}