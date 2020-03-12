package com.example.game.common.model

import com.example.game.common.model.enums.LevelButtonConfig

/**
 * Created by develop on 30.01.2017.
 */

open class ButtonLevel(val number: Int) {
    var status: LevelButtonConfig = LevelButtonConfig.STATUS_OPEN

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

    /**
     * Уровень открыт для нажатия
     */
    fun isOpen(): Boolean {
        return status == LevelButtonConfig.STATUS_OPEN || status == LevelButtonConfig.STATUS_CURRENT
    }
}