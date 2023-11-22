package com.example.pizzaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AddMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_menu)

        getSupportActionBar()?.hide()
    }
}