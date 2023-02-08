package com.example.oficiosejercicio

class DataSource {

    // metodo que retorna un list
    fun listado(): List<DataJobs> {


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

     return jobs
    }
}