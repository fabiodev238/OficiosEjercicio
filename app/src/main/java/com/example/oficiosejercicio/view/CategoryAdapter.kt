package com.example.oficiosejercicio.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.oficiosejercicio.R
import com.example.oficiosejercicio.model.DataCategory

class CategoryAdapter(val categoryList: List<DataCategory>) :
    RecyclerView.Adapter<CategoryAdapter.CategoryHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CategoryHolder(layoutInflater.inflate(R.layout.item_category, parent, false))

    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.render(categoryList[position])
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    class CategoryHolder(val view: View) : RecyclerView.ViewHolder(view) {

        val tvCategory1 = view.findViewById<TextView>(R.id.tvCategory)


        fun render(category: DataCategory) {
            tvCategory1.text = category.category

            val buscado = category.masBuscado

            if (buscado) {
                tvCategory1.text =" Lo más buscado de hoy -->  " + category.category




            }
        }

    }

}