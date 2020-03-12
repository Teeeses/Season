package com.example.game.winter.contracts

import com.example.game.abstracts.presenter.BaseMvpPresenter
import com.example.game.abstracts.view.BaseView
import com.example.game.common.GameInterface

interface WinterGameContract  {
    interface View: BaseView, GameInterface
    interface Presenter: BaseMvpPresenter<View>
}