package com.example.expired

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.setting)
    }

    fun goToLogin(view: View) {
        val statusIntent = Intent(this, LoginActivity::class.java)
        startActivity(statusIntent)
    }

    fun goToHome(view: View) {
        val statusIntent = Intent(this, HomeActivity::class.java)
        startActivity(statusIntent)
    }
}