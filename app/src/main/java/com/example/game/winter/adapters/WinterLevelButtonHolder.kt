package com.example.game.winter.adapters

import android.content.Context
import com.example.game.common.adapters.holders.LevelButtonHolder
import com.example.game.common.model.enums.Month
import com.example.game.databinding.WinterItemLevelBinding

class WinterLevelButtonHolder(
    context: Context,
    binding: WinterItemLevelBinding,
    month: Month,
    isEasy: Boolean,
    isHard: Boolean
) : LevelButtonHolder(binding.root, month) {

    init {

    }
}