package com.cbtis.valorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.widget.Toolbar

class LTiposCam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var toolbar: Toolbar? = null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ltipos_cam)
        toolbar = findViewById(R.id.toolbar)
        toolbar?.title="Seleccione un estilo"
        setSupportActionBar(toolbar)


        var estilos:ArrayList<estilo> = ArrayList()
                  estilos.add(estilo("Asesinos", R.drawable.asesino))

                  estilos.add(estilo("Luchadores", R.drawable.luchador))
                  estilos.add(estilo("Magos", R.drawable.mago))
                  estilos.add(estilo("Tiradores", R.drawable.tirador))
                  estilos.add(estilo("Soportes", R.drawable.soporte))
                  estilos.add(estilo("Tanques", R.drawable.tanque))





                val lista = findViewById<ListView>(R.id.Lista)
              //  val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, estilos)

                     val adaptador = AdaptadorCustom(this, estilos)



                lista.adapter = adaptador





        lista.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                // enviar a otra pagina


            if ((estilos.get(position).nombre)=="Asesinos"){
                var intent = Intent(this,Campeones::class.java)



                startActivity(intent)

                Toast.makeText(this, estilos.get(position).nombre, Toast.LENGTH_LONG).show()
            }else if ((estilos.get(position).nombre)=="Luchadores"){
                //si se cumple me pasa a este grid Luchadores
                var intent = Intent(this,GridL::class.java)

                startActivity(intent)
                Toast.makeText(this, estilos.get(position).nombre, Toast.LENGTH_LONG).show()
            }else if((estilos.get(position).nombre)=="Magos"){
                //si se cumple me pasa a este grid Magos
                var intent = Intent(this,GridM::class.java)

                startActivity(intent)
                Toast.makeText(this, estilos.get(position).nombre, Toast.LENGTH_LONG).show()
            }else if((estilos.get(position).nombre)=="Tiradores"){
                //si se cumple me pasa a este grid Tiradores
                var intent = Intent(this,GridTi::class.java)

                startActivity(intent)
                Toast.makeText(this, estilos.get(position).nombre, Toast.LENGTH_LONG).show()
            }else if((estilos.get(position).nombre)=="Soportes"){
                //si se cumple me pasa a este grid Soportes
                var intent = Intent(this,GridS::class.java)

                startActivity(intent)
                Toast.makeText(this, estilos.get(position).nombre, Toast.LENGTH_LONG).show()
            } else if((estilos.get(position).nombre)=="Tanques"){
                //si se cumple me pasa a este grid Tanques
                var intent = Intent(this,GridTa::class.java)

                startActivity(intent)
                Toast.makeText(this, estilos.get(position).nombre, Toast.LENGTH_LONG).show()
            }

        }







    }
}