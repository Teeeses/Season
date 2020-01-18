package com.example.game.common.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.game.common.adapters.holders.LevelButtonHolder
import com.example.game.common.model.ButtonLevel

abstract class BaseLevelsAdapter<BUTTON_LEVEL: ButtonLevel> : RecyclerView.Adapter<LevelButtonHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelButtonHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: LevelButtonHolder, position: Int) {

    }
}