package com.example.myaapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ProfileAdapter(private val list: List<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
        val view = LayoutInflater.from(viewGroup?.context)
            .inflate(R.layout.custom_item_view, viewGroup, false)
        val profileNameTextView = view.findViewById<TextView>(R.id.textProfileName)
        profileNameTextView.text = list[position]
        return view
    }
}