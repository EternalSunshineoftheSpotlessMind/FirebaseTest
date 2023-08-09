package com.example.firebasetest

import androidx.lifecycle.ViewModel
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoggingViewModel @Inject constructor(): ViewModel() {

    fun onLogButtonClick(){
        Firebase.analytics.logEvent("log_button_click", null)
    }
}