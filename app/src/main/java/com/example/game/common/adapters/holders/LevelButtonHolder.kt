package com.example.game.common.adapters.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.game.common.intrefaces.OnButtonLevelListener
import com.example.game.common.model.ButtonLevel
import com.example.game.common.model.enums.Month

abstract class LevelButtonHolder<BUTTON_LEVEL: ButtonLevel>(val view: View, val month: Month) : RecyclerView.ViewHolder(view) {

    var onButtonLevelListener: OnButtonLevelListener? = null

    abstract fun refresh(buttonLevel: BUTTON_LEVEL)

    abstract fun onBind(buttonLevel: BUTTON_LEVEL)

}