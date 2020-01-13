package com.example.game.common.model

import com.example.game.common.model.enums.LevelButtonConfig

/**
 * Created by develop on 30.01.2017.
 */

open class ButtonLevel(private val number: Int) {
    protected lateinit var status: LevelButtonConfig

    protected open fun refreshStatus(current: Int) {
        if (number == current) {
            status = LevelButtonConfig.STATUS_CURRENT
        }
        if (number > current) {
            status = LevelButtonConfig.STATUS_CLOSE
        }
        if (number < current) {
            status = LevelButtonConfig.STATUS_OPEN
        }
    }
}