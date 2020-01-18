package com.example.game.common.config.di

import com.example.game.common.presenters.MainActivityPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MainActivityModule {

    @Provides
    @Singleton
    fun providesPresenter(): MainActivityPresenter = MainActivityPresenter()

}