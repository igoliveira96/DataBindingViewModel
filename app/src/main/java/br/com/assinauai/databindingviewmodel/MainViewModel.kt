package br.com.assinauai.databindingviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var number = 1

    private val _counter = MutableLiveData<Int>()
    val counter: LiveData<Int>
        get() = _counter

    init {
        _counter.value = number
    }

    fun clickMe() {
        _counter.value = ++number
    }

}