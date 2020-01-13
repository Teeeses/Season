package com.example.game.common.config

import android.content.Context

class DeviceUtils {

    companion object {

        fun getWidthScreen(context: Context): Int = context.resources.displayMetrics.widthPixels
        fun getHeightScreen(context: Context): Int = context.resources.displayMetrics.heightPixels
    }
}
