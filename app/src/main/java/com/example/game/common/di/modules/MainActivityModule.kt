package com.example.game.common.di.modules

import android.app.Activity
import com.example.game.common.contracts.MainActivityContract
import com.example.game.common.presenters.MainActivityPresenter
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule(private var activity: Activity) {

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun providePresenter(): MainActivityContract.Presenter = MainActivityPresenter()
}