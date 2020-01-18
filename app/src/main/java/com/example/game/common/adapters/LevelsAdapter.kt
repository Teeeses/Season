package com.example.game.common.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.game.common.adapters.holders.LevelButtonHolder
import com.example.game.common.config.App
import com.example.game.common.intrefaces.OnButtonLevelListener
import com.example.game.common.model.ButtonLevel
import com.example.game.common.model.enums.Complication
import com.example.game.common.model.enums.Month
import com.example.game.databinding.WinterItemLevelBinding
import com.example.game.winter.adapters.WinterLevelButtonHolder
import java.util.ArrayList

abstract class LevelsAdapter<BUTTON_LEVEL: ButtonLevel>(private val array: ArrayList<BUTTON_LEVEL>,
                    private val month: Month) : BaseLevelsAdapter<BUTTON_LEVEL>(), OnButtonLevelListener {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelButtonHolder {
        val binding = WinterItemLevelBinding.inflate(LayoutInflater.from(parent.context))
        val holder = WinterLevelButtonHolder(parent.context, binding, month)

        holder.onButtonLevelListener = this

        return holder
    }


    override fun getItemCount(): Int {
        return array.size
    }

    override fun onClickLevel(level: Int, month: Month) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onLevelIsClose(level: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}