package com.example.game.common.config.di

import com.example.game.common.ui.GameActivity
import com.example.game.common.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        ContextModule::class, GameUtilsModule::class, MainActivityModule::class
    ]
)
@Singleton
interface AppDiComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(gameActivity: GameActivity)
}