package com.example.myapplication.opener

import android.view.View
import android.widget.Button
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OpenerActivityViewModel: ViewModel() {
    private val DefaultTab = "Form"
    val btnName = MutableLiveData<String>(DefaultTab)
    val FORM = 0
    val MY_FORMS = 1
    val RESPONSE = 2
    val SETTINGS = 3

    interface viewModelImpl {
        fun handleActionButton(button : Button)
    }
}