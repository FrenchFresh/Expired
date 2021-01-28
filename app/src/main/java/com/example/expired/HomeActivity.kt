package com.example.expired

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
    }

    fun goToSetting(view: View) {
        val statusIntent = Intent(this, SettingActivity::class.java)
        startActivity(statusIntent)
    }

    fun goToAddItem(view: View) {
        val statusIntent = Intent(this, NewItemActivity::class.java)
        startActivity(statusIntent)
    }

    fun goToList(view: View) {
        val statusIntent = Intent(this, ListActivity::class.java)
        startActivity(statusIntent)
    }

    fun goToHome(view: View) {
        val statusIntent = Intent(this, HomeActivity::class.java)
        startActivity(statusIntent)
    }
}