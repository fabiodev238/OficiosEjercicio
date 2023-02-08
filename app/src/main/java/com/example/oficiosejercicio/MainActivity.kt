package com.example.oficiosejercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val dataSource = DataSource()
        val jobs = dataSource.listado()
        initRecycler(jobs)



    }

    fun initRecycler(jobs:List<DataJobs>) {

        val rvOficios = findViewById<RecyclerView>(R.id.rvJobs)

        rvOficios.layoutManager = LinearLayoutManager(this)
        val adapter = OficiosAdapter(jobs)
        rvOficios.adapter = adapter
    }
}