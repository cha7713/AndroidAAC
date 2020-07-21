package com.awesomebly.androidaac

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VmShareViewModel(): ViewModel() {
   var progress : MutableLiveData<Int> = MutableLiveData<Int>(0)

    fun setProgress(i : Int){
        progress.value = i
    }


}