package com.example.pizzaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
    }

    val txtTotal: TextView = findViewById(R.id.textViewTotalPurchase)
    val txtChange: TextView = findViewById(R.id.textViewChange)
    val txtCash: EditText = findViewById(R.id.editTextCash)
    val btnFinish: Button = findViewById(R.id.buttonFinish)

    txt
}