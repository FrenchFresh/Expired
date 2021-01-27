package com.example.expired

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_pg1)
    }

    fun goToHome(view: View) {
        val statusIntent = Intent(this, HomeActivity::class.java)
        startActivity(statusIntent)
    }

    fun goToForgetPassword(view: View) {
        val statusIntent = Intent(this, ForgetPasswordActivity::class.java)
        startActivity(statusIntent)
    }

    fun goToRegisser(view: View) {
        val statusIntent = Intent(this, RegisterActivity::class.java)
        startActivity(statusIntent)
    }
}