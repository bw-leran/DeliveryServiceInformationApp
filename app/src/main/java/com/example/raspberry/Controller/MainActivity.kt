package com.example.raspberry.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.raspberry.Adapters.CategoryAdapter
import com.example.raspberry.Model.Category
import com.example.raspberry.R
import com.example.raspberry.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //can set a ${} statement for the Mililani part based on the setting that the region selection string is on
        adapter = CategoryAdapter(this, DataService.categoryMililani)
        main_list.adapter = adapter

        //main_list.setOnItemClickListener { adapterView, view, i, l ->
        //    val category = DataService.categoryMililani[i]
        //    Toast.makeText(this, "${category.title} cell clicked", Toast.LENGTH_SHORT).show()
        //}
    }
}
