package com.example.game.common.config

import android.app.Application
import com.example.game.common.config.di.*

class App: Application() {
    lateinit var component: AppDiComponent
        private set

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        component = DaggerAppDiComponent.builder()
            .contextModule(ContextModule(applicationContext))
            .saverSpref(GameUtilsModule())
            .mainActivityModule(MainActivityModule())
            .build()
    }

    companion object {
        private lateinit var INSTANCE: App
        @JvmStatic
        fun get(): App = INSTANCE
    }
}