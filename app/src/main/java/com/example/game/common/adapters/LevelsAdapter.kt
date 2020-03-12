package com.example.game.common.adapters

import androidx.recyclerview.widget.RecyclerView
import com.example.game.common.adapters.holders.LevelButtonHolder
import com.example.game.common.intrefaces.OnButtonLevelListener
import com.example.game.common.model.ButtonLevel
import java.util.*

abstract class LevelsAdapter<BUTTON_LEVEL : ButtonLevel>(
    private val array: ArrayList<BUTTON_LEVEL>
) : RecyclerView.Adapter<LevelButtonHolder<BUTTON_LEVEL>>() {

    open fun refreshStatus() {

    }

    override fun onBindViewHolder(holder: LevelButtonHolder<BUTTON_LEVEL>, position: Int) {
        val buttonLevel = array[position]
        holder.onBind(buttonLevel)
        holder.refresh(buttonLevel)
    }

    override fun getItemCount(): Int {
        return array.size
    }
}