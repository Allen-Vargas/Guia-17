package edu.bo.guia17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = arrayListOf<Book>()
        lista.add(Book("Roberto Carlos Callisaya Mamani", "calyr.software@gmail.com"))
        lista.add(Book("Gabriela Orosco Montaño", "gabriela_ocsoro@gmail.com"))

        val bookListAdapter = BookListAdapter(lista, this)
        recyclerView.adapter = bookListAdapter
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = linearLayoutManager
    }
}