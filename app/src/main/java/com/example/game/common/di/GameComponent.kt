package com.example.game.common.di

import com.example.game.common.di.modules.GameActivityModule
import com.example.game.common.contracts.GameActivityContract
import dagger.Component

@Component(
    modules = [
        GameActivityModule::class
    ]
)
interface GameComponent {
    fun inject(gameActivity: GameActivityContract.View)
}