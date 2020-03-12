package com.example.game.common.di

import com.example.game.common.di.modules.MainActivityModule
import com.example.game.common.ui.MainActivity
import dagger.Component

@Component(
    modules = [
        MainActivityModule::class
    ]
)
interface MainComponent {
    fun inject(mainActivity: MainActivity)
}