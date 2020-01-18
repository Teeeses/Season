package com.example.game.winter.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.game.common.adapters.LevelsAdapter
import com.example.game.common.config.DeviceUtils
import com.example.game.common.model.enums.Month
import com.example.game.common.ui.fragments.LevelsFragment
import com.example.game.databinding.FragmentLevelsWinterBinding
import com.example.game.winter.adapters.WinterLevelsAdapter
import com.example.game.winter.contracts.WinterLevelsContract
import com.example.game.winter.model.WinterButtonLevel
import java.util.*

class WinterLevelsFragment : LevelsFragment<WinterButtonLevel>(), WinterLevelsContract.View {

    private lateinit var viewHolder: FragmentLevelsWinterBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewHolder = FragmentLevelsWinterBinding.inflate(inflater, container, false)

        val params = RelativeLayout.LayoutParams(DeviceUtils.getWidthScreen(requireContext()),
            (DeviceUtils.getWidthScreen(requireContext()) * 0.646f).toInt())
        params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM)
        viewHolder.bottomImage.layoutParams = params

        viewHolder.scroll.smoothScrollTo(0, 0)

        return viewHolder.root
    }

    override fun createOneAdapter() {
        oneAdapter = createGrid(Month.DECEMBER)
        viewHolder.gvDecember.layoutManager = GridLayoutManager(requireContext(), NUMBER_LEVEL)
        viewHolder.gvDecember.adapter = oneAdapter
    }

    override fun createTwoAdapter() {
        twoAdapter = createGrid(Month.JANUARY)
        viewHolder.gvJanuary.layoutManager = GridLayoutManager(requireContext(), NUMBER_LEVEL)
        viewHolder.gvJanuary.adapter = twoAdapter
    }

    override fun createThreeAdapter() {}

    override fun createGrid(month: Month): LevelsAdapter<WinterButtonLevel> {
        return WinterLevelsAdapter(create(month), month)
    }

    override fun create(month: Month): ArrayList<WinterButtonLevel> {
        val array = ArrayList<WinterButtonLevel>()
        for (i in 1 .. month.dais) {
            array.add(WinterButtonLevel(i + 1))
        }
        return array
    }

    override fun onStartSkyDownfallAnimation() {
        TODO("как будет переделан снегопад")
    }

    override fun onStopSkyDownfallAnimation() {
        TODO("как будет переделан снегопад")
    }
}