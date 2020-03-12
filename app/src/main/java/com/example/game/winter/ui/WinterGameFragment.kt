package com.example.game.winter.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.game.common.ui.fragments.GameFragment
import com.example.game.databinding.FragmentWinterGameBinding
import com.example.game.winter.contracts.WinterGameContract
import com.example.game.winter.di.modules.WinterGameModule
import javax.inject.Inject

class WinterGameFragment: GameFragment(), WinterGameContract.View  {


    private lateinit var viewHolder: FragmentWinterGameBinding

    @Inject
    lateinit var presenter: WinterGameContract.Presenter

    override fun inject() {
        val component = DaggerWinterLevelsComponent.builder()
            .winterLevelsModule(WinterGameModule(this))
            .build()

        component.inject(this)
        presenter.attach(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewHolder = FragmentWinterGameBinding.inflate(inflater, container, false)
        return viewHolder.root
    }
    override fun start() {}

    override fun win() {}

    override fun restart() {}

    override fun nextLevel() {}

}