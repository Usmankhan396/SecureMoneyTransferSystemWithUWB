package com.example.securemoneytransfersystemwithuwb.views

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.securemoneytransfersystemwithuwb.R

class SplashActivity : AppCompatActivity() {


    private val SPLASH_DELAY: Long = 2000 // 2 seconds


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val mainIntent = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, SPLASH_DELAY)

    }
}