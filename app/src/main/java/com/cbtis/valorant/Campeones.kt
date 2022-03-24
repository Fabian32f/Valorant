package com.cbtis.valorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class Campeones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var toolbar: Toolbar? = null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_campeones)
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

        Tcampeones.add(estiloCampeon("Kayn", R.drawable.kayn))
        Tcampeones.add(estiloCampeon("Khazix", R.drawable.khazix))
        Tcampeones.add(estiloCampeon("MasterYi", R.drawable.masteryi))
        Tcampeones.add(estiloCampeon("Yone", R.drawable.yone))
        Tcampeones.add(estiloCampeon("Viego", R.drawable.viego))
        Tcampeones.add(estiloCampeon("Zed", R.drawable.zed))


        var grid: GridView = findViewById(R.id.grid)

        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Tcampeones)
        val adaptador = AdaptadorCustom2(this, Tcampeones)

        grid.adapter = adaptador

        grid.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->


                // esto sirve para el cambio de las paginas
            if(Tcampeones.get(position).nombre2=="Kayn"){
                var intent = Intent(this,Descripcion::class.java)

                startActivity(intent)

                Toast.makeText(this, Tcampeones.get(position).nombre2, Toast.LENGTH_SHORT).show()
            }else if(Tcampeones.get(position).nombre2=="Khazix"){
                var intent = Intent(this,Dkhazix::class.java)

                startActivity(intent)

                Toast.makeText(this, Tcampeones.get(position).nombre2, Toast.LENGTH_SHORT).show()
            }else if(Tcampeones.get(position).nombre2=="Yone"){
                var intent = Intent(this,Dyone::class.java)

                startActivity(intent)

                Toast.makeText(this, Tcampeones.get(position).nombre2, Toast.LENGTH_SHORT).show()
            }


        }

    }
}