package com.example.responsi148

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login.setOnClickListener {
            if (email.text.toString() == "lilis@gmail.com" || password.text.toString() == "1234567") {
                intent = Intent(this, HomeActivity::class.java)
            }
            else {
                Toast.makeText(getApplicationContext(), "Email anda salah", Toast.LENGTH_LONG).show()
            }
            startActivity(intent)

        }
    }
}
