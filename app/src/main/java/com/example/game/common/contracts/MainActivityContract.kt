package com.example.game.common.contracts

import com.example.game.abstracts.presenter.BaseMvpPresenter
import com.example.game.abstracts.view.BaseView
import com.example.game.common.model.enums.Month
import com.google.android.material.snackbar.Snackbar

interface MainActivityContract {
    interface View: BaseView {

        fun openGameActivity(level: Int, month: Month)
    }

    interface Presenter: BaseMvpPresenter<View>
}