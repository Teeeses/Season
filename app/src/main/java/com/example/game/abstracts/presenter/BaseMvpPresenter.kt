package com.example.game.abstracts.presenter

import com.example.game.abstracts.view.BaseView

interface BaseMvpPresenter<V: BaseView> {
    var isAttached: Boolean
    fun attach(view: V)
    fun detach()
}