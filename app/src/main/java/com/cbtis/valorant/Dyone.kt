package com.cbtis.valorant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class Dyone : AppCompatActivity() {
    var toolbar: Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dyone)

        toolbar = findViewById(R.id.toolbar)
        toolbar?.title="Descripción"
        setSupportActionBar(toolbar)
    }
}