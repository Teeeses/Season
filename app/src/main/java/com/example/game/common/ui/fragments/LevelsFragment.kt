package com.example.game.common.ui.fragments

import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import com.example.game.R
import com.example.game.abstracts.view.BaseFragment
import com.example.game.common.adapters.LevelsAdapter
import com.example.game.common.contracts.MainActivityContract
import com.example.game.common.intrefaces.OnButtonLevelListener
import com.example.game.common.intrefaces.SkyDownfallInterface
import com.example.game.common.model.ButtonLevel
import com.example.game.common.model.enums.Month
import com.google.android.material.snackbar.Snackbar
import java.util.ArrayList

abstract class LevelsFragment<BUTTONS : ButtonLevel>: BaseFragment(), SkyDownfallInterface, OnButtonLevelListener {

    protected lateinit var oneAdapter: LevelsAdapter
    protected lateinit var twoAdapter: LevelsAdapter
    protected lateinit var threeAdapter: LevelsAdapter

    private lateinit var sbLevelClosed: Snackbar

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createSnackBar(view)
        createOneAdapter()
        createTwoAdapter()
        createThreeAdapter()
    }

    private fun createSnackBar(view: View) {
        sbLevelClosed = Snackbar.make(view, requireContext().resources.getString(R.string.level_is_close), Snackbar.LENGTH_SHORT)
        val sbView = sbLevelClosed.view
        val tv = sbView.findViewById<TextView>(R.id.snackbar_text)
        tv.textAlignment = View.TEXT_ALIGNMENT_CENTER
        tv.gravity = Gravity.CENTER_HORIZONTAL
        tv.typeface = Typeface.createFromAsset(requireContext().assets, "font/level_personal.ttf")
    }

    private fun showSnackBar() {
        if (!sbLevelClosed.isShown) {
            sbLevelClosed.show()
        }
    }

    abstract fun createOneAdapter()

    abstract fun createTwoAdapter()

    abstract fun createThreeAdapter()

    abstract fun createGrid(month: Month): LevelsAdapter

    abstract fun create(month: Month): ArrayList<BUTTONS>

    private fun refreshButtonsStatus() {
        oneAdapter.refreshStatus()
        twoAdapter.refreshStatus()
        threeAdapter.refreshStatus()
    }

    override fun onClickLevel(level: Int, month: Month) {
        (requireActivity() as MainActivityContract.View).openGameActivity(level, month)
    }

    override fun onLevelIsClose(level: Int) {
        showSnackBar()
    }

    override fun onResume() {
        super.onResume()
        onStartSkyDownfallAnimation()
        refreshButtonsStatus()
    }

    override fun onPause() {
        super.onPause()
        onStopSkyDownfallAnimation()
    }

    override fun onStop() {
        super.onStop()
        onStopSkyDownfallAnimation()
    }

    override fun onDestroy() {
        super.onDestroy()
        onStopSkyDownfallAnimation()
    }

    companion object {
        const val NUMBER_LEVEL = 3
    }
}