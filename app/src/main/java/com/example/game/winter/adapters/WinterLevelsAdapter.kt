package com.example.game.winter.adapters

import android.view.ViewGroup
import com.example.game.common.adapters.LevelsAdapter
import com.example.game.common.adapters.holders.LevelButtonHolder
import com.example.game.common.model.enums.Month
import com.example.game.winter.model.WinterButtonLevel
import java.util.ArrayList

class WinterLevelsAdapter(
    private val array: ArrayList<WinterButtonLevel>,
    private val month: Month
) : LevelsAdapter<WinterButtonLevel>(array, month) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelButtonHolder {
        return super.onCreateViewHolder(parent, viewType)
    }
}