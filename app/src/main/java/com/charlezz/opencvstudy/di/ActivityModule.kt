package com.charlezz.opencvstudy.di

import com.charlezz.opencvstudy.ui.camera.CameraActivity
import com.charlezz.opencvstudy.ui.camera.CameraModule
import com.charlezz.opencvstudy.ui.filter.FilterActivity
import com.charlezz.opencvstudy.ui.filter.FilterModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [(FilterModule::class)])
    abstract fun mainActivity(): FilterActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [(CameraModule::class)])
    abstract fun cameraActivity(): CameraActivity
}
