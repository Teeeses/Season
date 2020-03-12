package com.example.game.winter.di

import com.example.game.winter.di.modules.WinterGameModule
import com.example.game.winter.ui.WinterGameFragment
import dagger.Component

@Component(
    modules = [
        WinterGameModule::class
    ]
)
interface WinterGameComponent {
    fun inject(fragment: WinterGameFragment)
}