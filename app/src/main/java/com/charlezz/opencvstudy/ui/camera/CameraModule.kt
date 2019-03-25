package com.charlezz.opencvstudy.ui.camera

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import com.charlezz.opencvstudy.R
import com.charlezz.opencvstudy.databinding.ActivityCameraBinding
import com.charlezz.opencvstudy.di.ActivityScope
import dagger.Module
import dagger.Provides

@Module
abstract class CameraModule {
    @Module
    companion object {
        @JvmStatic
        @Provides
        @ActivityScope
        fun provideActivityBinding(activity: CameraActivity): ActivityCameraBinding {
            return DataBindingUtil.setContentView(activity, R.layout.activity_camera)
        }

        @JvmStatic
        @Provides
        @ActivityScope
        fun provideViewModel(activity: CameraActivity) = ViewModelProviders.of(activity).get(CameraViewModel::class.java)
    }

}