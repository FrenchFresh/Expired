package com.example.expired

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class ForgetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgetpasword)
    }

    fun goToLogin(view: View) {
        val statusIntent = Intent(this, LoginActivity::class.java)
        startActivity(statusIntent)
    }
}