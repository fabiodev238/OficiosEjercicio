package com.example.oficiosejercicio.data

import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.oficiosejercicio.R
import com.example.oficiosejercicio.model.DataJobs
import com.example.oficiosejercicio.view.MainActivity


class Repository {

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

    /*
   fun iniText(view: View) {
        val etText1A: TextView = view.findViewById<TextView>(R.id.etText1)
        val etText2A = view.findViewById<TextView>(R.id.etText2)
        val etText3A = view.findViewById<TextView>(R.id.etText3)

        etText1A.text = "Presupuestosjjj"
        etText2A.text = "Promocioness"
        etText3A.text = "Novedadesf"

    }
    */

}