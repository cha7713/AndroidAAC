package com.awesomebly.androidaac

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class CounterViewModel(application: Application) : AndroidViewModel(application) {
    var counter : MutableLiveData<Int> = MutableLiveData<Int>()
    init {
        counter.value = 0
    }

    fun counterPlus() : Unit{
        counter.value = counter.value!!.plus(1)
    }

    fun counterMinus() : Unit{
        counter.value = counter.value!!.minus(1)
    }

}