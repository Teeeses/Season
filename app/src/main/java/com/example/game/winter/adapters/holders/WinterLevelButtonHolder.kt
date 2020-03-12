package com.example.game.winter.adapters.holders

import android.content.Context
import com.example.game.common.adapters.holders.LevelButtonHolder
import com.example.game.common.intrefaces.OnButtonLevelListener
import com.example.game.common.model.enums.Month
import com.example.game.databinding.WinterLevelItemBinding
import com.example.game.winter.model.WinterButtonLevel

class WinterLevelButtonHolder(
    context: Context,
    private val binding: WinterLevelItemBinding,
    private val listener: OnButtonLevelListener?,
    month: Month
) : LevelButtonHolder<WinterButtonLevel>(binding.root, month) {

    override fun refresh(buttonLevel: WinterButtonLevel) {

    }

    override fun onBind(buttonLevel: WinterButtonLevel) {
        binding.tvLevel.text = buttonLevel.number.toString()
        binding.levelLayout.setOnClickListener {
            if(buttonLevel.isOpen()) {
                listener?.onClickLevel(buttonLevel.number, month)
            } else {
                listener?.onLevelIsClose(buttonLevel.number)
            }
        }
    }

}