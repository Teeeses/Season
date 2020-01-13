package com.example.game.common.contracts

import com.example.game.abstracts.presenter.BaseMvpPresenter
import com.example.game.abstracts.view.BaseView

interface GameActivityContract {
    interface View: BaseView
    interface Presenter: BaseMvpPresenter<View>
}