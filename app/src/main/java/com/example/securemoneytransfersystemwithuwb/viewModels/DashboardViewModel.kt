package com.example.securemoneytransfersystemwithuwb.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.securemoneytransfersystemwithuwb.utilities.DASHBOARD_SCREEN
import com.example.securemoneytransfersystemwithuwb.utilities.RECEIVE_MONEY_SCREEN
import com.example.securemoneytransfersystemwithuwb.utilities.SEND_MONEY_SCREEN


class DashboardViewModel() : ViewModel() {
    var navigate = MutableLiveData("")
    var name = MutableLiveData("")
    var balance = MutableLiveData("")
    var email = MutableLiveData("")
    var password = MutableLiveData("")


    fun onClickedLoadMoney() {
        //implement logic to load/add money from a resource to the account
    }

    fun onClickedSendMoney() {

        navigate.value = SEND_MONEY_SCREEN
    }

    fun onClickedReceiveMoney() {
        navigate.value = RECEIVE_MONEY_SCREEN
    }


}