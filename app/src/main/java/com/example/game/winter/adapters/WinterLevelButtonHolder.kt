package com.example.game.winter.adapters

import android.content.Context
import com.example.game.common.adapters.holders.LevelButtonHolder
import com.example.game.common.model.ButtonLevel
import com.example.game.common.model.enums.Month
import com.example.game.databinding.WinterItemLevelBinding

class WinterLevelButtonHolder(
    context: Context,
    binding: WinterItemLevelBinding,
    month: Month
) : LevelButtonHolder(binding.root, month) {

    override fun refresh(buttonLevel: ButtonLevel) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}