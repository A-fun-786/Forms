package com.example.myapplication.opener

import android.service.quicksettings.Tile
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class OpenerViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var fragments: MutableList<Fragment> = mutableListOf()
    private var fragmentsTitle: MutableList<String> = mutableListOf()

    fun add(fragment: Fragment, title: String) {
        fragments.add(fragment)
        fragmentsTitle.add(title)
    }
    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentsTitle.get(position)
    }
}