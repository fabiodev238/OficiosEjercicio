package com.example.oficiosejercicio

import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.recyclerview.widget.RecyclerView


class OficiosAdapter(val dataJobs: List<DataJobs>) : RecyclerView.Adapter<OficiosAdapter.JobsHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobsHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return JobsHolder(layoutInflater.inflate(R.layout.item_oficios, parent, false))

    }

    override fun onBindViewHolder(holder: JobsHolder, position: Int) {
        holder.render(dataJobs[position])
    }

    override fun getItemCount(): Int = dataJobs.size

    class JobsHolder(val view: View) : RecyclerView.ViewHolder(view) {

        private val tvTrabajos = view.findViewById<TextView>(R.id.tvTrabajos)
        private val tvJornada = view.findViewById<TextView>(R.id.tvJornada)

        fun render(dataJobs: DataJobs) {
            tvJornada.text = dataJobs.jornada
            tvTrabajos.text = dataJobs.oficio

        }
    }
}