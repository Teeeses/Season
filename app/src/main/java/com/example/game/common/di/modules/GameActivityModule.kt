package com.example.game.common.di.modules

import android.app.Activity
import com.example.game.common.contracts.GameActivityContract
import com.example.game.common.presenters.GameActivityPresenter
import dagger.Module
import dagger.Provides

@Module
class GameActivityModule(private var activity: Activity) {

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun providePresenter(): GameActivityContract.Presenter = GameActivityPresenter()
}