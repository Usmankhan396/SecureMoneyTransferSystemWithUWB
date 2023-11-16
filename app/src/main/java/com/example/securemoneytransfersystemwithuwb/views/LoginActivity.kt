package com.example.securemoneytransfersystemwithuwb.views

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.securemoneytransfersystemwithuwb.R
import com.example.securemoneytransfersystemwithuwb.databinding.ActivityLoginBinding
import com.example.securemoneytransfersystemwithuwb.viewModels.LoginViewModel
import com.example.securemoneytransfersystemwithuwb.utilities.DASHBOARD_SCREEN
import com.example.securemoneytransfersystemwithuwb.utilities.FORGOT_PASSWORD_SCREEN
import com.example.securemoneytransfersystemwithuwb.utilities.SIGNUP_SCREEN


class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel: LoginViewModel
    lateinit var activityLoginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initViews();
        initViewModel();
        initDataBinding();
        navigationObserver();
        showErrorStateObserver();

    }

    private fun initViews() {
        activityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this)[LoginViewModel::class.java]
    }

    private fun initDataBinding() {
        activityLoginBinding.loginData = viewModel
        activityLoginBinding.lifecycleOwner = this
    }

    private fun navigationObserver() {
        viewModel.navigate.observe(this) {
            when (it) {
                DASHBOARD_SCREEN -> navigateToDashBoard()
                FORGOT_PASSWORD_SCREEN -> navigateToForgotPasswordScreen()
                SIGNUP_SCREEN -> navigateToSignUpScreen()
            }
        }
    }

    private fun navigateToDashBoard() {
        startActivity(Intent(this@LoginActivity, DashboardActivity::class.java))
    }

    private fun navigateToForgotPasswordScreen() {

    }

    private fun navigateToSignUpScreen() {

    }

    private fun showErrorStateObserver() {
        viewModel.showError.observe(this) {
            if (it) {
                Toast.makeText(this, "Empty or Invalid Credentials", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
