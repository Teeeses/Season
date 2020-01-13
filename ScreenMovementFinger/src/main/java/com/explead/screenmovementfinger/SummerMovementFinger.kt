package com.explead.screenmovementfinger

import android.view.MotionEvent
import android.view.View

class SummerMovementFinger(
    private val field: View,
    private val sizeField: Float,
    private val sizeCells: Int,
    private val onFingerMovementCallback: OnFingerMovementCallback
) {

    private var lastX = -1
    private var lastY = -1

    interface OnFingerMovementCallback {
        fun onDown(x: Int, y: Int)
        fun onMove(x: Int, y: Int)
        fun onUp(x: Int, y: Int)
    }

    fun setTouchView() {
        field.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    val x = (event.y / (sizeField / sizeCells)).toInt()
                    val y = (event.x / (sizeField / sizeCells)).toInt()
                    onFingerMovementCallback.onDown(x, y)
                }
                MotionEvent.ACTION_MOVE -> {
                    val x = (event.y / (sizeField / sizeCells)).toInt()
                    val y = (event.x / (sizeField / sizeCells)).toInt()
                    if (x >= 0 && y >= 0 && x < sizeCells && y < sizeCells) {
                        if (x != lastX || y != lastY) {
                            lastX = x
                            lastY = y
                            onFingerMovementCallback.onMove(x, y)
                        }
                    }
                }
                MotionEvent.ACTION_UP -> {
                    val x = (event.y / (sizeField / sizeCells)).toInt()
                    val y = (event.x / (sizeField / sizeCells)).toInt()
                    onFingerMovementCallback.onUp(x, y)
                }
                else -> {
                }
            }
            true
        }
    }
}
