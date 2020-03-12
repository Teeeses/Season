package com.example.game.common.di

import com.example.game.common.config.App
import com.example.game.common.di.modules.ApplicationModule
import dagger.Component

@Component(
    modules = [ApplicationModule::class]
)
interface AppDiComponent {
    fun inject(app: App)
}