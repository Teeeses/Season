package com.example.game.winter.contracts

import com.example.game.abstracts.presenter.BaseMvpPresenter
import com.example.game.abstracts.view.BaseView

interface WinterLevelsContract {
    interface View: BaseView
    interface Presenter: BaseMvpPresenter<View>
}