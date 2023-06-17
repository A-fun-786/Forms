package com.example.myapplication.opener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityOpenerMainBinding

class OpenerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOpenerMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opener_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_opener_main)
        var viewPagerAdapter = OpenerViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter.add(MyFormsFragment(),"My Forms")
        viewPagerAdapter.add(QuizFragment(),"Quiz")
        viewPagerAdapter.add(ResponseFragment(),"Response")
        viewPagerAdapter.add(SettingsFragment(),"Settings")

        binding.apply {
            viewpager.adapter = viewPagerAdapter
            tabLayout.setupWithViewPager(viewpager)
        }
    }
}