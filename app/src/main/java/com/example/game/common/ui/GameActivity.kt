package com.example.game.common.ui

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.game.R
import com.example.game.abstracts.view.BaseCompatActivity
import com.example.game.common.config.App
import com.example.game.common.contracts.GameActivityContract
import com.example.game.common.presenters.GameActivityPresenter
import com.example.game.databinding.ActivityGameBinding
import javax.inject.Inject

class GameActivity : BaseCompatActivity(), GameActivityContract.View {

    @Inject
    private lateinit var presenter: GameActivityPresenter
    private lateinit var binding: ActivityGameBinding

    override fun init(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_game)
        App.get().component.inject(this)
        presenter.attach(this)
    }
}