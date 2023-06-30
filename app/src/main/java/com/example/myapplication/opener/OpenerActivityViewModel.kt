package com.example.myapplication.opener

import android.view.View
import android.widget.Button
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OpenerActivityViewModel: ViewModel() {
    private val DefaultTab = "My Forms"
    val btnName = MutableLiveData<String>(DefaultTab)
    val MY_FORMS = 0
    val QUIZ = 1
    val RESPONSE = 2
    val SETTINGS = 3

    fun updateButtonText(fragment: Int) {
        when (fragment) {
            MY_FORMS -> btnName.value = "My Forms"
            QUIZ -> btnName.value = "Quiz"
            RESPONSE -> btnName.value = "Response"
            SETTINGS -> btnName.value = "Settings"
        }
    }

    interface viewModelImpl {
        fun handleActionButton(button : Button)
    }
}