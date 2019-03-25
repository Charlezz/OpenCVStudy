package com.charlezz.opencvstudy.util

import android.databinding.BindingAdapter
import android.graphics.Bitmap
import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Glide

object ImageBindingAdapter{
    @JvmStatic
    @BindingAdapter("imageUri")
    fun setImageUri(view: ImageView, uri:Uri?){
        if(uri!=null){
            Glide.with(view).load(uri).into(view)
        }
    }

    @JvmStatic
    @BindingAdapter("imageBmp")
    fun setImageBitmap(view: ImageView, bmp:Bitmap?){
        if(bmp!=null){
            Glide.with(view).load(bmp).into(view)
        }
    }
}