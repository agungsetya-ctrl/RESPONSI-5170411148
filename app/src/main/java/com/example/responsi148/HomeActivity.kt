package com.example.responsi148

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        listView = findViewById(R.id.listView)
        var list = mutableListOf<Model>()
        Akun.setOnClickListener {
            intent = Intent(this, AkunActivity::class.java)
            startActivity(intent)
        }

        list.add(Model("", "",R.drawable.cc))
        list.add(Model("DVD", "Alat Elektronik yg di gunakan untuk menonton DVD", R.drawable.dvd))
        list.add(Model("Lemari Es", "Alat Elektronik yg di gunakan untuk mendinginkan", R.drawable.kulkas))
        list.add(Model("Oven", "Alat Elektronik yg di gunakan untuk memanggang", R.drawable.oven))
        list.add(Model("Microwave", "Alat Elektronik yg di gunakan untuk memanaskan", R.drawable.micro))
        list.add(Model("Komputer", "Alat Elektronik yg di gunakan untuk segalanya", R.drawable.komput))
        list.add(Model("Kompor Listrik", "Alat Elektronik yg di gunakan untuk memasak", R.drawable.kompor))
        list.add(Model("Setrika", "Alat Elektronik yg di gunakan untuk menyetrika", R.drawable.setrik))
        list.add(Model("Mesin Cuci", "Alat Elektronik yg di gunakan untuk mencuci", R.drawable.mesinc))
        list.add(Model("Dispenser", "Alat Elektronik yg di gunakan untuk minum", R.drawable.dispen))
        list.add(Model("TV", "Alat Elektronik yg di gunakan untuk menonton", R.drawable.tv))

        listView.adapter = MyListAdapter(this,R.layout.raw,list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                Toast.makeText(this@HomeActivity, "",   Toast.LENGTH_LONG).show()
            }
            if (position==1){
                Toast.makeText(this@HomeActivity, "Ini DVD",   Toast.LENGTH_LONG).show()
            }
            if (position==2){
                Toast.makeText(this@HomeActivity, "Ini Lemari ES", Toast.LENGTH_LONG).show()
            }
            if (position==3){
                Toast.makeText(this@HomeActivity, "Ini Oven",  Toast.LENGTH_LONG).show()
            }
            if (position==4){
                Toast.makeText(this@HomeActivity, "Ini Microwive",  Toast.LENGTH_LONG).show()
            }
            if (position==5){
                Toast.makeText(this@HomeActivity, "Ini Komputer",  Toast.LENGTH_LONG).show()
            }
            if (position==6){
                Toast.makeText(this@HomeActivity, "Ini Kompor Listrik",  Toast.LENGTH_LONG).show()
            }
            if (position==7){
                Toast.makeText(this@HomeActivity, "Ini Setrika",  Toast.LENGTH_LONG).show()
            }
            if (position==8){
                Toast.makeText(this@HomeActivity, "Ini Mesin Cuci",  Toast.LENGTH_LONG).show()
            }
            if (position==9){
                Toast.makeText(this@HomeActivity, "Ini Dispenser",  Toast.LENGTH_LONG).show()

            }
            if (position==10){
                Toast.makeText(this@HomeActivity, "Ini TV",   Toast.LENGTH_LONG).show()
            }
        }
    }
}
