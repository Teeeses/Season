package com.example.game.abstracts.view

import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment: Fragment(), BaseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inject()
    }

    abstract fun inject()
}