package com.example.game.winter.di.modules

import com.example.game.winter.contracts.WinterLevelsContract
import com.example.game.winter.presenters.WinterLevelsPresenter
import com.example.game.winter.ui.WinterLevelsFragment
import dagger.Module
import dagger.Provides

@Module
class WinterLevelsModule(private var view: WinterLevelsFragment) {

    @Provides
    fun provideView(): WinterLevelsFragment {
        return view
    }

    @Provides
    fun providePresenter(): WinterLevelsContract.Presenter = WinterLevelsPresenter()
}