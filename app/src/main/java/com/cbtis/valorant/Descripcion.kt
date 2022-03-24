package com.cbtis.valorant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class Descripcion : AppCompatActivity() {

    var toolbar: Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_descripcion)

        toolbar = findViewById(R.id.toolbar)
        toolbar?.title="Descripción"
        setSupportActionBar(toolbar)









    }
}