package com.example.myapplication.opener.myforms

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class FormRecyclerViewAdapter: RecyclerView.Adapter<FormViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FormViewHolder {
        val layoutInflator = LayoutInflater.from(parent.context)
        val formList = layoutInflator.inflate(R.layout.my_form_list,parent,false)
        return FormViewHolder(formList)
    }

    override fun onBindViewHolder(holder: FormViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}

class FormViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    val textView = view.findViewById<TextView>(R.id.text_view)
    val formTemplate = view.findViewById<ImageView>(R.id.question)
}