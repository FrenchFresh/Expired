package com.example.expired

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.edititems.*
import kotlinx.android.synthetic.main.newitems.*

class EditItemActivity : AppCompatActivity() {
    var quantity = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edititems)
    }

    fun minusQuantity(view: View) {
        quantity++
        inputQuantity2.setText(quantity)
    }
    fun addQuantity(view: View) {
        quantity++
        inputQuantity2.setText(quantity)
    }

    fun goToHome(view: View) {
        val statusIntent = Intent(this, HomeActivity::class.java)
        startActivity(statusIntent)
    }
}