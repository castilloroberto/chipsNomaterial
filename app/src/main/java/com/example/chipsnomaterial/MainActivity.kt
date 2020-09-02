package com.example.chipsnomaterial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.ParcelFileDescriptor
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var listaTitulos = mutableListOf<String>()
    private var listaDescrip = mutableListOf<String>()
    private var listaImgs = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        postList()

        rv_lista.layoutManager = LinearLayoutManager(this)
        rv_lista.adapter = RecyclerAdapter(listaTitulos,listaDescrip,listaImgs)

    }


    private fun addList(title:String,description: String, image:Int){
        listaTitulos.add(title)
        listaDescrip.add(description)
        listaImgs.add(image)

    }

    private fun postList(){
        for (i in 1..25){
            addList("titulo #$i","descripcion # $i",R.drawable.ic_cohete)
        }


    }
}