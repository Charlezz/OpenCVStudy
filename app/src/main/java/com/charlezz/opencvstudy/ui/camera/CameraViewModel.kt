package com.charlezz.opencvstudy.ui.camera

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Size

class CameraViewModel: ViewModel(){
    val previewSize = MutableLiveData<Size>()

    init {


    }
}