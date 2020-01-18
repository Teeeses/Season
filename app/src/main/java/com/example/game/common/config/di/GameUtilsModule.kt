package com.example.game.common.config.di

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class GameUtilsModule {

    @Provides
    @Singleton
    fun providesSaverSpref(context: Context): SaverSpref = SaverSpref(context)
}