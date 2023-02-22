package com.example.oficiosejercicio.data

import android.view.View
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import com.example.oficiosejercicio.R
import com.example.oficiosejercicio.model.DataCategory
import com.example.oficiosejercicio.model.DataJobs
import com.example.oficiosejercicio.view.MainActivity
import java.util.*


class Repository {


    fun lista(): List<String> {

        val list: List<String> = listOf(
            "Contactenos",
            "Presupuestas",
            "Promociones"
        )

        return list
    }

    fun listado(): List<DataJobs> {
        val jobs: List<DataJobs> = listOf(
            DataJobs("Cerrajero"),
            DataJobs("Carnicero"),
            DataJobs("Cervecero"),
            DataJobs("Remisero"),
            DataJobs("Plomero"),
            DataJobs("Gasista"),
            DataJobs("Cerrajero"),
            DataJobs("Carnicero"),
            DataJobs("Cervecero"),
            DataJobs("Remisero"),
            DataJobs("Plomero"),
            DataJobs("Gasista"),
            DataJobs("Cerrajero"),
            DataJobs("Carnicero"),
            DataJobs("Cervecero"),
            DataJobs("Remisero"),
            DataJobs("Plomero"),
            DataJobs("Gasista"),
            DataJobs("Cerrajero"),
            DataJobs("Carnicero"),
            DataJobs("Cervecero"),
            DataJobs("Remisero"),
            DataJobs("Plomero"),
            DataJobs("Gasista")
        )

        return jobs

    }

    fun categoryJobs(): List<DataCategory> {

        val jobsCategory: List<DataCategory> = listOf(


            DataCategory("Salud",true),
            DataCategory("Estetica",false),
            DataCategory("Maestranza",false),
            DataCategory("Cultura",true),
            DataCategory("Administración",false),
            DataCategory("Herreria",false),
            DataCategory("Automotor",true),
            DataCategory("Motos",false),
            DataCategory("Construccion",true),
            DataCategory("Belleza",false),
            DataCategory("Belleza",false),
            DataCategory("Belleza",false),
            DataCategory("Belleza",false),
            DataCategory("Belleza",false),
            DataCategory("Belleza",false),
            DataCategory("Belleza",false),
            DataCategory("Belleza",false)
        )
        return jobsCategory

    }
}