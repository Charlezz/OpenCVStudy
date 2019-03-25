package com.charlezz.opencvstudy.ui.filter

import android.app.Application
import android.arch.lifecycle.*
import android.graphics.Bitmap
import android.net.Uri
import android.provider.MediaStore
import android.view.View
import org.opencv.android.Utils
import org.opencv.core.Mat
import org.opencv.imgproc.Imgproc


class FilterViewModel(val app: Application): AndroidViewModel(app){

    val startImagePicker=MutableLiveData<Unit>()

    val imageUri = MutableLiveData<Uri?>()
    var convertedImage: LiveData<Bitmap?> = Transformations.map(imageUri){ uri->
        if(uri!=null){
            var bitmap = MediaStore.Images.Media.getBitmap(app.contentResolver, uri)
            val mat = Mat()
            Utils.bitmapToMat(bitmap, mat)
            bitmap.recycle()
            val mat2 = Mat()
            Imgproc.cvtColor(mat, mat2, Imgproc.COLOR_RGB2GRAY)
            bitmap = Bitmap.createBitmap(mat2.cols(), mat2.rows(), Bitmap.Config.ARGB_8888)
            Utils.matToBitmap(mat2, bitmap)
            return@map bitmap
        }
        return@map null
    }
    val addBtnVisibility = MediatorLiveData<Int>().apply {
        value = View.VISIBLE
    }

    init {

        addBtnVisibility.addSource(imageUri) {
            addBtnVisibility.value = if( it == null){ View.VISIBLE }else{ View.GONE }
        }
    }

    fun loadImage(){

        startImagePicker.value = null
    }


}