package com.example.game.abstracts.view

import android.view.View

interface BaseView {

    fun showView(view: View, isShown: Boolean) {
        view.visibility = if(isShown) View.VISIBLE else View.GONE
    }
}