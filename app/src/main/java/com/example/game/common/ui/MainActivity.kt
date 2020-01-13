package com.example.game.common.ui

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.game.R
import com.example.game.abstracts.view.BaseCompatActivity
import com.example.game.common.adapters.MyPagerAdapter
import com.example.game.common.config.App
import com.example.game.common.contracts.MainActivityContract
import com.example.game.common.model.enums.Month
import com.example.game.common.presenters.MainActivityPresenter
import com.example.game.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import javax.inject.Inject

class MainActivity : BaseCompatActivity(), MainActivityContract.View {

    @Inject
    private lateinit var presenter: MainActivityPresenter
    private lateinit var binding: ActivityMainBinding

    override fun init(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        App.get().component.inject(this)
        presenter.attach(this)

        val adapter = MyPagerAdapter(supportFragmentManager)
        binding.viewPager.adapter = adapter
        binding.viewPager.fixScrollSpeed()
    }

    override fun openGameActivity(level: Int, month: Month) {
        val intent = Intent(this@MainActivity, GameActivity::class.java)
        intent.putExtra("level", level)
        intent.putExtra("month", month)
        startActivity(intent)
    }
}
