package com.example.responsi148

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_akun.*

class AkunActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun)

        val bundle = intent.extras
        val nomo = bundle?.get("nama")
        val osol = bundle?.get("asal")
        val omor = bundle?.get("umur")

        nime.text=nomo.toString()
        isel.text=osol.toString()
        imur.text=omor.toString()

    }
}
