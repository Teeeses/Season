package com.example.game.winter.di

import com.example.game.winter.di.modules.WinterLevelsModule
import com.example.game.winter.ui.WinterLevelsFragment
import dagger.Component

@Component(
    modules = [
        WinterLevelsModule::class
    ]
)
interface WinterLevelsComponent {
    fun inject(fragment: WinterLevelsFragment)
}