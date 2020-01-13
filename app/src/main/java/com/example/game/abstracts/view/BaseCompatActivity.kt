package com.example.game.abstracts.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseCompatActivity: AppCompatActivity(), BaseView {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        init(savedInstanceState)
    }

    protected abstract fun init(savedInstanceState: Bundle?)
}