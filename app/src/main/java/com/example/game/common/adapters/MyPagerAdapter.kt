package com.example.game.common.adapters


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.game.winter.ui.WinterLevelsFragment

/**
 * Created by develop on 13.12.2016.
 */
class MyPagerAdapter(fm: FragmentManager, behavior: Int = BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) :
    FragmentPagerAdapter(fm, behavior) {

    private val fragments = arrayOf<Fragment>(WinterLevelsFragment())

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getPageTitle(position: Int): String? {
        return Integer.toString(position + 1)
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }
}