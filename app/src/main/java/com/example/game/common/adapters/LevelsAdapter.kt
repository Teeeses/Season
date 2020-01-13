package com.example.game.common.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.game.common.adapters.holders.LevelButtonHolder
import com.example.game.common.config.App
import com.example.game.common.config.SaverSpref
import com.example.game.common.intrefaces.OnButtonLevelListener
import com.example.game.common.model.ButtonLevel
import com.example.game.common.model.enums.Complication
import com.example.game.common.model.enums.Month
import com.example.game.databinding.WinterItemLevelBinding
import com.example.game.winter.adapters.WinterLevelButtonHolder
import java.util.ArrayList

class LevelsAdapter<BUTTON_LEVEL: ButtonLevel>(private val array: ArrayList<ButtonLevel>,
                    private val spref: SaverSpref,
                    private val month: Month) : BaseLevelsAdapter(), OnButtonLevelListener {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelButtonHolder {
        val binding = WinterItemLevelBinding.inflate(LayoutInflater.from(parent.context))

        val easyArray = App.get().saverSpref.getArray(month, Complication.EASY).contains(number)
        val hardArray = App.get().saverSpref.getArray(month, Complication.HARD)
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

    fun refreshStatus() {
        val easyArray = App.get().saverSpref.getArray(month, Complication.EASY)
        val hardArray = App.get().saverSpref.getArray(month, Complication.HARD)
        for ((index, element) in array.withIndex()) {
            val number = index + 1
            val isEasy = easyArray.contains(number)
            val isHard = hardArray.contains(number)
            element.refreshStatus(easyArray.size, isEasy, isHard)
        }
        notifyDataSetChanged()
    }
}