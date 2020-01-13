package com.example.game.winter.model

import com.example.game.common.model.ButtonLevel

class WinterButtonLevel(number: Int): ButtonLevel(number) {

    var isEasyCompleted: Boolean = false
    var isHardCompleted: Boolean = false

    override fun refreshStatus(current: Int) {
        super.refreshStatus(current)
    }
}