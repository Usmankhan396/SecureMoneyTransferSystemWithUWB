package com.example.securemoneytransfersystemwithuwb.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.securemoneytransfersystemwithuwb.utilities.DASHBOARD_SCREEN
import com.example.securemoneytransfersystemwithuwb.utilities.RECEIVE_MONEY_SCREEN
import com.example.securemoneytransfersystemwithuwb.utilities.SEND_MONEY_SCREEN


class DashboardViewModel() : ViewModel() {
    var navigate = MutableLiveData("")
    var email = MutableLiveData("")
    var password = MutableLiveData("")


    fun onClickedLoginButton() {
        if (email.value.equals("usmanlodhi396@gmail.com") && password.value.equals("132456789"))
            navigate.value = DASHBOARD_SCREEN
    }

    fun onClickedSendMoney() {

        navigate.value = SEND_MONEY_SCREEN
    }

    fun onClickedReceiveMoney() {
        navigate.value = RECEIVE_MONEY_SCREEN
    }


}