package com.example.game.common.di.modules

import android.app.Application
import com.example.game.common.di.scope.PerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val app: Application) {

    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application = app
}