package com.example.game.winter.presenters

import com.example.game.abstracts.presenter.BasePresenter
import com.example.game.winter.contracts.WinterGameContract

class WinterGamePresenter : BasePresenter<WinterGameContract.View>(), WinterGameContract.Presenter
