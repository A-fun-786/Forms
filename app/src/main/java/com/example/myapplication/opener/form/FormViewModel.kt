package com.example.myapplication.opener.form

import android.content.Context
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.lifecycle.ViewModel
import com.example.myapplication.R

class FormViewModel : ViewModel() {

    fun handleSpinner(spinner: Spinner, context: Context) {
    //        val viewPairList = arrayListOf<Pair<String,Int>>()
    //        viewPairList.add(Pair("First", R.drawable.ic_baseline_sticky_note_2_24))
    //        viewPairList.add(Pair("Second", R.drawable.ic_baseline_sticky_note_2_24))
    //        viewPairList.add(Pair("Third", R.drawable.ic_baseline_sticky_note_2_24))
        val list = arrayListOf("first","Second","Third")
        Log.i("Affan","In viewmodel spinner")
        val adapter = ArrayAdapter(context,R.layout.spinner_answertype,list)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
    }

}

//class CustomArrayAdapter(context:Context,viewPair: List<Pair<String,Int>>,layoutRes:Int) : ArrayAdapter<Pair<String,Int>>(context,layoutRes) {
//
//    var viewPair: List<Pair<String,Int>>
//    init {
//        this.viewPair = viewPair
//    }
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        val spinnerText = convertView?.findViewById<TextView>(R.id.spinner_text)
////        val spinnerImage = convertView?.findViewById<ImageView>(R.id.spinner_image)
//        spinnerText?.text = viewPair[position].first
////        spinnerImage?.setImageResource(viewPair[position].second)
//
//        return convertView!!
//    }
//
//    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
//        val spinnerText = convertView?.findViewById<TextView>(R.id.spinner_text)
////        val spinnerImage = convertView?.findViewById<ImageView>(R.id.spinner_image)
//        spinnerText?.text = viewPair[position].first
////        spinnerImage?.setImageResource(viewPair[position].second)
//        return convertView!!
//    }
//}
