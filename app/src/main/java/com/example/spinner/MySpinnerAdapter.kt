package com.example.spinner

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import com.example.spinner.databinding.ItemSpinnerBinding

class MySpinnerAdapter(val list: List<String>,  context: Context):BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val itemSpinnerBinding = ItemSpinnerBinding.inflate(LayoutInflater.from(parent?.context),parent,false)
        itemSpinnerBinding.spinnerItem.text = list[position]
        return itemSpinnerBinding.root
    }


}