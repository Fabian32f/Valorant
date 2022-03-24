package com.cbtis.valorant

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorCustom2(var context: Context, items2:ArrayList<estiloCampeon>):BaseAdapter(){

    var items2:ArrayList<estiloCampeon>? = null
    init {
        this.items2 = items2
    }


    override fun getCount(): Int {
        return items2?.count()!!
    }

    override fun getItem(p0: Int): Any {
        return items2?.get(p0)!!
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var vista2 = p1
        var holder2:ViewHolder2? = null

        if(vista2 == null){
            vista2 = LayoutInflater.from(context).inflate(R.layout.templategrid, null)
            holder2 = ViewHolder2(vista2)
            vista2.tag = holder2
        }else{
            holder2 = vista2.tag as? ViewHolder2
        }

        val item = items2?.get(p0) as? estiloCampeon
        holder2?.nombre2?.text = item?.nombre2
        holder2?.imagen2?.setImageResource(item?.imagen2!!)

        return vista2!!
    }


    private class ViewHolder2(vista:View){
        var nombre2: TextView? = null
        var imagen2: ImageView? = null

        init {
            nombre2 = vista.findViewById(R.id.nombre2)
            imagen2 = vista.findViewById(R.id.imagen2)
        }
    }


}