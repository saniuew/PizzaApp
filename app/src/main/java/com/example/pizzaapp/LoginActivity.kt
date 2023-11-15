package com.example.pizzaapp


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //hide title bar
        getSupportActionBar()?.hide()

        //instance text
        val txtUsername: EditText = findViewById(R.id.editTextEmail)
        val txtPassword: EditText = findViewById(R.id.editTextPassword)
        //instance button login
        val btnLogin: Button = findViewById(R.id.buttonLogin)
        val btnRegister: TextView = findViewById(R.id.editTextRegister)

        btnRegister.setOnClickListener{

        }
        //event button login
        btnLogin.setOnClickListener {
            val databaseHelper = DatabaseHelper(this)

            //val data:String = databaseHelper.checkData("stevi.ema@amikom.ac.id")
            //Toast.makeText(this@LoginActivity,"Result : " + data,Toast.LENGTH_SHORT).show()
            //if (data==null){
                databaseHelper.addAccount("stevi.ema@amikom.ac.id","Stevi Ema W","Cashier","12345")

            val email = txtUsername.text.toString().trim()
            val password = txtPassword.text.toString().trim()

            val result: Boolean = databaseHelper.checkLogin(email, password)
            if (result == true) {
                Toast.makeText(this, "Login Success ", Toast.LENGTH_SHORT).show()
                val intentLogin = Intent(this, MainActivity::class.java)
                startActivity(intentLogin)
            } else {
                Toast.makeText(this, "Login Failed, Try Again !!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
