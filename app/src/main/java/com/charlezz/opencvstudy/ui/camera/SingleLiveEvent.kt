package com.charlezz.opencvstudy.ui.camera

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import android.support.annotation.MainThread
import android.util.Log
import java.util.concurrent.atomic.AtomicBoolean

class SingleLiveEvent<T> : MutableLiveData<T>(){
    val TAG = SingleLiveEvent::class.java.simpleName
    val pending = AtomicBoolean(false)

    @MainThread
    override fun observe(owner: LifecycleOwner, observer: Observer<T>) {
        if(hasActiveObservers()){
            Log.w(TAG, "Multiple observers registered but only one will be notified of changes.");
        }
        super.observe(owner, Observer {
            if(pending.compareAndSet(true,false)){
                observer.onChanged(it)
            }
        })
    }

    @MainThread
    override fun setValue(value: T) {
        pending.set(true)
        super.setValue(value)
    }

    @MainThread
    fun call(){
        setValue(null as T)
    }
}