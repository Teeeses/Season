package com.example.game.common.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.game.R
import com.example.game.abstracts.view.BaseCompatActivity
import com.example.game.common.di.DaggerGameComponent
import com.example.game.common.di.modules.GameActivityModule
import com.example.game.common.contracts.GameActivityContract
import com.example.game.common.model.enums.Month
import com.example.game.common.model.enums.Season
import com.example.game.common.model.game.OpenGameConfiguration
import com.example.game.common.ui.fragments.GameFragment
import com.example.game.winter.ui.WinterGameFragment
import javax.inject.Inject

class GameActivity : BaseCompatActivity(), GameActivityContract.View {

    @Inject
    lateinit var presenter: GameActivityContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        intent.getBundleExtra("bundle")?.let {
            val configuration = it.getParcelable<OpenGameConfiguration>(GameFragment.ARG_CONFIGURATION)!!
            val level = configuration.level
            val month = configuration.month

            switchGameFragment(level, month)
        }
    }

    private fun switchGameFragment(level: Int, month: Month?) {
        month?.let {
            when (it.season) {
                Season.WINTER -> openWinterFragment(level, it)
                Season.SPRING -> TODO()
                Season.SUMMER -> TODO()
                Season.AUTUMN -> TODO()
            }
        }
    }

    private fun openWinterFragment(level: Int, month: Month) {
        openFragment(WinterGameFragment(), level, month)
    }

    private fun openFragment(fragment: Fragment, level: Int, month: Month) {
        val transaction = supportFragmentManager.beginTransaction()
        val bundle = Bundle()
        bundle.putParcelable(GameFragment.ARG_CONFIGURATION, OpenGameConfiguration(level, month))
        intent.putExtra("bundle", bundle)
        fragment.arguments = bundle
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commitAllowingStateLoss()
    }

    override fun inject() {
        val mainComponent = DaggerGameComponent.builder()
            .gameActivityModule(GameActivityModule(this))
            .build()

        mainComponent.inject(this)
        presenter.attach(this)
    }
}