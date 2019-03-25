package com.charlezz.opencvstudy.ui.filter

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import com.charlezz.opencvstudy.R
import com.charlezz.opencvstudy.databinding.ActivityFilterBinding
import com.charlezz.opencvstudy.di.ActivityScope
import dagger.Module
import dagger.Provides

@Module
abstract class FilterModule {
    @Module
    companion object {
        @JvmStatic
        @Provides
        @ActivityScope
        fun provideMainActivityBinding(activity: FilterActivity): ActivityFilterBinding {
            return DataBindingUtil.setContentView(activity, R.layout.activity_filter)
        }

        @JvmStatic
        @Provides
        @ActivityScope
        fun provideViewModel(activity:FilterActivity) = ViewModelProviders.of(activity).get(FilterViewModel::class.java)
    }

}