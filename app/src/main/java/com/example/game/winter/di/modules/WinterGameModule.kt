package com.example.game.winter.di.modules

import com.example.game.winter.contracts.WinterGameContract
import com.example.game.winter.presenters.WinterGamePresenter
import com.example.game.winter.ui.WinterGameFragment
import dagger.Module
import dagger.Provides

@Module
class WinterGameModule(private var view: WinterGameFragment) {

    @Provides
    fun provideView(): WinterGameFragment {
        return view
    }

    @Provides
    fun providePresenter(): WinterGameContract.Presenter = WinterGamePresenter()
}