package com.example.game.winter.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.game.common.adapters.LevelsAdapter
import com.example.game.common.adapters.holders.LevelButtonHolder
import com.example.game.common.intrefaces.OnButtonLevelListener
import com.example.game.common.model.enums.Month
import com.example.game.databinding.WinterLevelItemBinding
import com.example.game.winter.adapters.holders.WinterLevelButtonHolder
import com.example.game.winter.model.WinterButtonLevel
import java.util.*

class WinterLevelsAdapter(
    private val context: Context,
    array: ArrayList<WinterButtonLevel>,
    private val listener: OnButtonLevelListener?,
    private val month: Month
) : LevelsAdapter<WinterButtonLevel>(array) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LevelButtonHolder<WinterButtonLevel> {
        val binding = WinterLevelItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return WinterLevelButtonHolder(
            context,
            binding,
            listener,
            month
        )
    }
}