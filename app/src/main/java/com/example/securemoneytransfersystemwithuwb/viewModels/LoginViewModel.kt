package com.example.securemoneytransfersystemwithuwb.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.securemoneytransfersystemwithuwb.utilities.DASHBOARD_SCREEN
import com.example.securemoneytransfersystemwithuwb.utilities.FORGOT_PASSWORD_SCREEN
import com.example.securemoneytransfersystemwithuwb.utilities.SIGNUP_SCREEN


class LoginViewModel() : ViewModel() {
    var navigate = MutableLiveData("")
    var showError = MutableLiveData(false)
    var email = MutableLiveData("")
    var password = MutableLiveData("")


    fun onClickedLoginButton() {
        if (email.value.equals("usmanlodhi396@gmail.com") && password.value.equals("123456"))
            navigate.value = DASHBOARD_SCREEN
        else
            showError.value = true
    }

    fun onClickedSignUp() {
        navigate.value = SIGNUP_SCREEN
    }

    fun onClickedForgotPassword() {
        navigate.value = FORGOT_PASSWORD_SCREEN
    }


}