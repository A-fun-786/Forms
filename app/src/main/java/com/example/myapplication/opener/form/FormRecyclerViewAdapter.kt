package com.example.myapplication.opener.form

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.opener.OpenerActivity

class FormRecyclerViewAdapter(activity: Activity?): RecyclerView.Adapter<QuestionViewHolder>() {
    var mActivity: Activity?
    init {
       mActivity = activity
    }
    lateinit var viewModel:FormViewModel
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.question_list,parent,false)
        viewModel = FormViewModel()
        return QuestionViewHolder(itemView,parent)
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
//        viewModel.handleSpinner(holder.getSpinner(),holder.itemView.context)
//        holder.setText("Affan")
        val dataList = arrayListOf("first","Second","Third")
        val spinnerAdapter = ArrayAdapter(
                mActivity?.applicationContext!!,
                R.layout.spinner_answertype,
                R.id.weekofday,
                dataList)

        holder.spinner.adapter = spinnerAdapter

        holder.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>, view: View?, i: Int, l: Long) {
                val selectedItem = adapterView.getItemAtPosition(i) as String
                Toast.makeText(mActivity,selectedItem, Toast.LENGTH_LONG).show()
                // Perform any actions based on the selected item
            }

            override fun onNothingSelected(adapterView: AdapterView<*>) {
                // Handle case where no item is selected
            }
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}

class QuestionViewHolder(itemView: View, parent: ViewGroup) : RecyclerView.ViewHolder(itemView){
    val context = parent.context
//    private val text = itemView.findViewById<TextView>(R.id.answer_type)
    val spinner = itemView.findViewById<Spinner>(R.id.spinner_form)

//    fun setText(str : String) {
//        text.text = str
//    }

}