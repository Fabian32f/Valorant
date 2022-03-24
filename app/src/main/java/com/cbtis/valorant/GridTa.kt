package com.cbtis.valorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class GridTa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var toolbar: Toolbar? = null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_ta)
        toolbar = findViewById(R.id.toolbar)
        toolbar?.title="Seleccione un campeon"
        setSupportActionBar(toolbar)


        var Tcampeones = ArrayList<estiloCampeon>()

        /*
        Tcampeones.add("Kayn")
        Tcampeones.add("Khazix")
        Tcampeones.add("MasterYi")
        Tcampeones.add("Yone")
        Tcampeones.add("Yasuo")
        Tcampeones.add("Zed")*/

        Tcampeones.add(estiloCampeon("Warwik", R.drawable.warwik))
        Tcampeones.add(estiloCampeon("Shen", R.drawable.shen))
        Tcampeones.add(estiloCampeon("Sett", R.drawable.sett))
        Tcampeones.add(estiloCampeon("Ornn", R.drawable.orn))
        Tcampeones.add(estiloCampeon("Malphite", R.drawable.malphite))
        Tcampeones.add(estiloCampeon("Gnar", R.drawable.gnar))




        var grid: GridView = findViewById(R.id.grid)

        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Tcampeones)
        val adaptador = AdaptadorCustom2(this, Tcampeones)

        grid.adapter = adaptador

        grid.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->


            var intent = Intent(this,Descripcion::class.java)

            startActivity(intent)

            Toast.makeText(this, Tcampeones.get(position).nombre2, Toast.LENGTH_SHORT).show()
        }

    }
}