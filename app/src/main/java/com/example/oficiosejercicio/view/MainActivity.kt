package com.example.oficiosejercicio.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.oficiosejercicio.model.DataJobs
import com.example.oficiosejercicio.R
import com.example.oficiosejercicio.data.Repository
import com.example.oficiosejercicio.model.DataCategory
import com.example.oficiosejercicio.viewmodel.OficiosViewModel

class MainActivity : AppCompatActivity() {

    val repository = Repository()
    val viewModel = OficiosViewModel(repository)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val jobs = viewModel.getListado()
        val listF = viewModel.getLista()
        val listC = viewModel.getListaCategory()

        initRecycler(jobs)
        iniText(listF)
        recycler(listC)
    }


    fun initRecycler(jobs: List<DataJobs>) {

        val rvOficios = findViewById<RecyclerView>(R.id.rvJobs)
        rvOficios.layoutManager = LinearLayoutManager(this)

        val adapter = OficiosAdapter(jobs)
        rvOficios.adapter = adapter


    }

    fun recycler(lista: List<DataCategory>) {

        val rvCategory = findViewById<RecyclerView>(R.id.rvJobs2)
        rvCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapter1 = CategoryAdapter(lista)
        rvCategory.adapter = adapter1

        Toast.makeText(this,"Bienvenidos a Oficios, Contactenos!", Toast.LENGTH_SHORT).show()

    }


    fun iniText(lista: List<String>) {

        val texA = lista[0]
        val texB = lista[1]
        val texC = lista[2]

        val tex1 = findViewById<TextView>(R.id.etText1)
        tex1.text = texA

        val text2 = findViewById<TextView>(R.id.etText2)
        text2.text = texB

        val text3 = findViewById<TextView>(R.id.etText3)
        text3.text = texC

    }


}