package com.example.oficiosejercicio.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.oficiosejercicio.model.DataJobs
import com.example.oficiosejercicio.R
import com.example.oficiosejercicio.data.Repository
import com.example.oficiosejercicio.viewmodel.OficiosViewModel

class MainActivity : AppCompatActivity() {

    val repository = Repository()
    val viewModel = OficiosViewModel(repository)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val jobs = viewModel.getListado()

        initRecycler(jobs)
        iniText(jobs)

    }

    fun initRecycler(jobs: List<DataJobs>) {
        val rvOficios = findViewById<RecyclerView>(R.id.rvJobs)
        rvOficios.layoutManager = LinearLayoutManager(this)
        val adapter = OficiosAdapter(jobs)
        rvOficios.adapter = adapter

    }

    fun iniText(jobs: List<DataJobs>) {

        val texA = jobs[0].oficio
        val texB = jobs[1].oficio
        val texC = jobs[2].oficio

        val tex1 = findViewById<TextView>(R.id.etText1)
        tex1.text = texA

        val text2 = findViewById<TextView>(R.id.etText2)
        text2.text = texB

        val text3 = findViewById<TextView>(R.id.etText3)
        text3.text = texC



    }


}