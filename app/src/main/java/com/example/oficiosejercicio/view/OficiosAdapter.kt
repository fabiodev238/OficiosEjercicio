package com.example.oficiosejercicio.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.oficiosejercicio.R
import com.example.oficiosejercicio.model.DataJobs


class OficiosAdapter(val dataJobs: List<DataJobs>) :
    RecyclerView.Adapter<OficiosAdapter.JobsHolder>() {


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


        fun render(dataJobs: DataJobs) {
            tvTrabajos.text = dataJobs.oficio
            tvTrabajos.textSize

        }
    }
}