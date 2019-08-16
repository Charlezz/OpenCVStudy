package com.charlezz.opencvstudy.ui

import android.arch.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor() : ViewModel() {
    val items = ArrayList<MainMenu>().apply {
        add(MainMenu.MERGE)
    }

}