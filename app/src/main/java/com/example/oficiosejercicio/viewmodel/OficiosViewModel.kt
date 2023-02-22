package com.example.oficiosejercicio.viewmodel

import android.view.View
import android.widget.TextView
import com.example.oficiosejercicio.R
import com.example.oficiosejercicio.data.Repository
import com.example.oficiosejercicio.model.DataCategory
import com.example.oficiosejercicio.model.DataJobs

class OficiosViewModel(val repository: Repository) {



    fun getListado(): List<DataJobs> {
        return repository.listado()
    }

    fun getLista():List<String>  {
        return repository.lista()

    }

    fun getListaCategory():List<DataCategory>{
        return repository.categoryJobs()
    }


}