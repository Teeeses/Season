package com.example.game.common.ui.fragments

import android.os.Bundle
import com.example.game.abstracts.view.BaseFragment
import com.example.game.common.GameInterface
import com.example.game.common.model.enums.Month
import com.example.game.common.model.game.OpenGameConfiguration

open class GameFragment: BaseFragment() {

    protected var level: Int = 0
    protected lateinit var month: Month

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val configuration = it.getParcelable<OpenGameConfiguration>(ARG_CONFIGURATION)!!
            level = configuration.level
            month = configuration.month
        }
    }

    override fun inject() {}

    companion object {
        const val ARG_CONFIGURATION = "configuration"
    }
}