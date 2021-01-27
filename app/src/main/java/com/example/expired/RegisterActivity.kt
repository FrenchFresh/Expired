package com.example.expired

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
    }

    fun goToLogin(view: View) {
        val statusIntent = Intent(this, LoginActivity::class.java)
        startActivity(statusIntent)
    }
}