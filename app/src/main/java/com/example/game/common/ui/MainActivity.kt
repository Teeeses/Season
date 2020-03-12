package com.example.game.common.ui

import android.content.Intent
import android.os.Bundle
import com.example.game.R
import com.example.game.abstracts.view.BaseCompatActivity
import com.example.game.common.adapters.MyPagerAdapter
import com.example.game.common.di.DaggerMainComponent
import com.example.game.common.di.modules.MainActivityModule
import com.example.game.common.contracts.MainActivityContract
import com.example.game.common.model.enums.Month
import com.example.game.common.model.game.OpenGameConfiguration
import com.example.game.common.ui.fragments.GameFragment
import github.chenupt.springindicator.viewpager.ScrollerViewPager
import javax.inject.Inject

class MainActivity : BaseCompatActivity(), MainActivityContract.View {

    @Inject
    lateinit var presenter: MainActivityContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createScrollerViewPager()
    }

    override fun inject() {
        val mainComponent = DaggerMainComponent.builder()
            .mainActivityModule(MainActivityModule(this))
            .build()

        mainComponent.inject(this)
        presenter.attach(this)
    }

    private fun createScrollerViewPager() {
        val viewPager = findViewById<ScrollerViewPager>(R.id.view_pager)
        val adapter = MyPagerAdapter(supportFragmentManager)
        viewPager.adapter = adapter
        viewPager.fixScrollSpeed()
    }

    override fun openGameActivity(level: Int, month: Month) {
        val intent = Intent(this@MainActivity, GameActivity::class.java)
        val bundle = Bundle()
        bundle.putParcelable(GameFragment.ARG_CONFIGURATION, OpenGameConfiguration(level, month))
        intent.putExtra("bundle", bundle)
        startActivity(intent)
    }
}
