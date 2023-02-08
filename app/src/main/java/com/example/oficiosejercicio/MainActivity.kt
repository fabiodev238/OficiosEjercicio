package com.example.oficiosejercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

open class MainActivity : AppCompatActivity() {


    val jobs: List<DataJobs> = listOf(
        DataJobs("Cerrajero", "completo"),
        DataJobs("Carnicero", "completo"),
        DataJobs("Cervecero", "4 horas"),
        DataJobs("Remisero", "franquero"),
        DataJobs("Plomero", "6 horas"),
        DataJobs("gasista", "completo"),
        DataJobs("Cerrajero", "completo"),
        DataJobs("Carnicero", "completo"),
        DataJobs("Cervecero", "4 horas"),
        DataJobs("Remisero", "franquero"),
        DataJobs("Plomero", "6 horas"),
        DataJobs("gasista", "completo")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()

        val dataSource = DataSource()
        val listado = dataSource.listado()
        //dataSource.listado()
        // asignar listado a un recylcer view y mostrarlo en pantalla

    }

    fun initRecycler() {

        val rvOficios = findViewById<RecyclerView>(R.id.rvJobs)

        rvOficios.layoutManager = LinearLayoutManager(this)
        val adapter = OficiosAdapter(jobs)
        rvOficios.adapter = adapter
    }
}