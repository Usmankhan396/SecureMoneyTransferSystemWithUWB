package com.example.securemoneytransfersystemwithuwb.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.securemoneytransfersystemwithuwb.R
import com.example.securemoneytransfersystemwithuwb.databinding.ActivityDashboardBinding
import com.example.securemoneytransfersystemwithuwb.databinding.ActivityLoginBinding
import com.example.securemoneytransfersystemwithuwb.viewModels.DashboardViewModel
import com.example.securemoneytransfersystemwithuwb.viewModels.LoginViewModel

class DashboardActivity : AppCompatActivity() {

    private lateinit var viewModel: DashboardViewModel
    lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        initViews();
        initViewModel();
        initDataBinding();
    }

    private fun initViews() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dashboard);
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this)[DashboardViewModel::class.java]
    }

    private fun initDataBinding() {
        binding.dashboardData = viewModel
        binding.lifecycleOwner = this
    }

}