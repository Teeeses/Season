package com.example.game.common.ui.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.example.game.common.intrefaces.OnGameBarClickListener
import com.example.game.databinding.GameBarBinding

class GameBar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : RelativeLayout(context, attrs, defStyleAttr), OnGameBarClickListener {

    init {
        init(context)
    }

    private lateinit var viewHolder: GameBarBinding
    private var onGameBarClickListener: OnGameBarClickListener? = null

    private fun init(context: Context) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        viewHolder = GameBarBinding.inflate(inflater)
        viewHolder.actions = this

        this.addView(viewHolder.root)
    }

    fun setOnMenuClickListener(listener: OnGameBarClickListener) {
        onGameBarClickListener = listener
    }

    fun setNumberLevel(level: Int) {
        viewHolder.tvNumberLevel.text = String.format("%s", level)
    }

    override fun onMenu() {
        onGameBarClickListener?.onMenu()
    }

    override fun onRestart() {
        onGameBarClickListener?.onRestart()
    }

    override fun onHelp() {
        onGameBarClickListener?.onHelp()
    }
}
