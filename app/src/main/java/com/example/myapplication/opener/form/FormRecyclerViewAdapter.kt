package com.example.myapplication.opener.form

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class FormRecyclerViewAdapter(formItemListener: FormItemImpl): RecyclerView.Adapter<QuestionViewHolder>() {

    val formItemListener:FormItemImpl
    init {
        this.formItemListener = formItemListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.question_list,parent,false)
        return QuestionViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {

        resetItemUI(holder)

        holder.questionAddOnBtn.setOnClickListener {
            holder.showQuestionAddOnLayout()
        }
        holder.answerTypeBtn.setOnClickListener {
            holder.showAnswerTypeLayout()
        }
//        holder.question.setOnFocusChangeListener { v, hasFocus ->
//            formItemListener.onQuestionFocussed(position)
//        }
//        handleAnswerTypeLayout(holder)
//        handleQuestionAddOnLayout(holder)

    }

    private fun resetItemUI(holder: QuestionViewHolder) {
        holder.hideAnswerTypeLayout()
        holder.hideQuestionAddOnLayout()
    }

    private fun handleQuestionAddOnLayout(holder: QuestionViewHolder) {

    }

    private fun handleAnswerTypeLayout(holder: QuestionViewHolder) {

    }

    override fun getItemCount(): Int {
        return 3
    }
}

class QuestionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val questionAddOnLayout: LinearLayout = itemView.findViewById(R.id.question_addon_layout)
    val answerTypeLayout: LinearLayout = itemView.findViewById(R.id.answer_type_layout)
    val answerTypeBtn: LinearLayout = itemView.findViewById(R.id.answer_type)
    val questionAddOnBtn: ImageView = itemView.findViewById(R.id.question_addon_btn)
    val answerTypeSelected: TextView = itemView.findViewById(R.id.answer_type_selected)
    val question: TextView = itemView.findViewById(R.id.question)

    fun hideQuestionAddOnLayout() {
        questionAddOnLayout.visibility = View.GONE
    }
    fun hideAnswerTypeLayout() {
        answerTypeLayout.visibility = View.GONE
    }
    fun showQuestionAddOnLayout() {
        questionAddOnLayout.visibility = View.VISIBLE
    }
    fun showAnswerTypeLayout() {
        answerTypeLayout.visibility = View.VISIBLE
    }
}