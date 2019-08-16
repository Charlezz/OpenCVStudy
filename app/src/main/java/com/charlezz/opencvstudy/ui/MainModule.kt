package com.charlezz.opencvstudy.ui

import android.databinding.DataBindingUtil
import com.charlezz.opencvstudy.R
import com.charlezz.opencvstudy.databinding.ActivityMainBinding
import com.charlezz.opencvstudy.di.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class MainModule {
    @Module
    companion object {
        @JvmStatic
        @Provides
        @ActivityScope
        fun provideMainActivityBinding(activity: MainActivity): ActivityMainBinding {
            return DataBindingUtil.setContentView(activity, R.layout.activity_main)
        }

        @JvmStatic
        @Provides
        @ActivityScope
        fun provideMainAdapter(activity: MainActivity)= MainAdapter(activity)

    }
}
