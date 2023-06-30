package com.example.myapplication.opener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityOpenerMainBinding
import com.example.myapplication.opener.myforms.*
import com.example.myapplication.opener.quiz.*
import com.example.myapplication.opener.response.*
import com.example.myapplication.opener.settings.*

class OpenerActivity : AppCompatActivity(), OnPageChangeListener{
    private lateinit var binding: ActivityOpenerMainBinding
    private lateinit var viewModel: OpenerActivityViewModel
    private lateinit var viewModelImpl: OpenerActivityViewModel.viewModelImpl
    var viewPagerAdapter = OpenerViewPagerAdapter(supportFragmentManager)
    private val TAG : String = "OpenerActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opener_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_opener_main)
        viewModel = OpenerActivityViewModel()
        binding.bViewModel = viewModel
        binding.lifecycleOwner = this

        viewPagerAdapter.apply {
            add(MyFormsFragment(),"My Forms")
            add(QuizFragment(),"Quiz")
            add(ResponseFragment(),"Response")
            add(SettingsFragment(),"Settings")
        }

        binding.apply {
            viewpager.adapter = viewPagerAdapter
            tabLayout.setupWithViewPager(viewpager)
            viewpager.addOnPageChangeListener(this@OpenerActivity)
            //TODO: Tab icon setup
        }

    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

    override fun onPageSelected(position: Int) {
        when(position) {
            viewModel.MY_FORMS -> viewModelImpl = MyFormsFragment()
            viewModel.QUIZ -> viewModelImpl = QuizFragment()
            viewModel.RESPONSE -> viewModelImpl = ResponseFragment()
            viewModel.SETTINGS -> viewModelImpl = SettingsFragment()
        }
        viewModelImpl.handleActionButton(binding.actionButton)
    }

    override fun onPageScrollStateChanged(state: Int) {}

}
