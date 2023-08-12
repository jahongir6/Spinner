package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.spinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
MyData.addElement()
        //selectedItem disang tanlangan itemi keladi
        // selectedItemPosition bersayiz indexi keladi


        // bu ham dinamik ham statikga kiradi
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(
                    this@MainActivity,
                    "${binding.spinner.selectedItem}",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        //bu array xolatdagisi
        /*val myAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, MyData.titleList)
        binding.spinner.adapter = myAdapter*/

        val myAdapter = MySpinnerAdapter(MyData.titleList,this)
        binding.spinner.adapter = myAdapter
    }
}