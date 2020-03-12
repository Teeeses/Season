package com.example.game.common.config

import android.app.Application
import com.example.game.common.di.AppDiComponent
import com.example.game.common.di.DaggerAppDiComponent
import com.example.game.common.di.modules.ApplicationModule

class App: Application() {
    lateinit var component: AppDiComponent

    override fun onCreate() {
        super.onCreate()
        setup()
    }

    private fun setup() {
        component = DaggerAppDiComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }
}