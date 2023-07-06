package com.example.myapplication.opener.form

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class FormRecyclerViewAdapter: RecyclerView.Adapter<QuestionViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val questionList = layoutInflater.inflate(R.layout.question_list,parent,false)
        return QuestionViewHolder(questionList)
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3
    }
}

class QuestionViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val formTemplate = view.findViewById<EditText>(R.id.question)
}