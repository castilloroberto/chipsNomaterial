package com.example.chipsnomaterial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(
    private var titulos: List<String>,
    private var ditails: List<String>,
    private var images: List<Int>
) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val itemTitulo: TextView = itemView.findViewById(R.id.tv_titulo)
        val itemDetail: TextView = itemView.findViewById(R.id.tv_descp)
        val itemPicture: ImageView = itemView.findViewById(R.id.iv_image)

        init {
            itemView.setOnClickListener { v: View ->
                val posistion: Int = adapterPosition
                Toast.makeText(
                    itemView.context,
                    "Seleccionaste el item #${posistion + 1} ",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.items_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titulos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemTitulo.text = titulos[position]
        holder.itemDetail.text = ditails[position]
        holder.itemPicture.setImageResource(images[position])

    }


}