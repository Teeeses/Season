package com.example.game.common.intrefaces

import com.example.game.common.model.enums.Month

interface OnButtonLevelListener {
    fun onClickLevel(level: Int, month: Month)
    fun onLevelIsClose(level: Int)
}