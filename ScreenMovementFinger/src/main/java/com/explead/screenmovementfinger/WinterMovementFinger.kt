package com.explead.screenmovementfinger

import android.view.MotionEvent
import android.view.View

class WinterMovementFinger(private val onSideFingerMovementCallback: OnSideFingerMovementCallback) {
    private var startX: Int = 0
    private var startY: Int = 0
    private var endX: Int = 0
    private var endY: Int = 0

    interface OnSideFingerMovementCallback {
        fun onUp()
        fun onDown()
        fun onRight()
        fun onLeft()
    }

    fun setTouchView(view: View) {

        view.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    startX = event.x.toInt()
                    startY = event.y.toInt()
                }
                MotionEvent.ACTION_UP -> {
                    endX = event.x.toInt()
                    endY = event.y.toInt()
                    move(startX, startY, endX, endY)
                }
                else -> {
                }
            }

            true
        }
    }

    private fun move(start_x: Int, start_y: Int, end_x: Int, end_y: Int) {
        val side1 = start_x - end_x
        val side2 = start_y - end_y
        val hypotenuse = Math.sqrt((Math.abs(side1 * side1) + Math.abs(side2 * side2)).toDouble()).toInt()
        val angle = Math.asin(side2.toDouble() / hypotenuse) * 57.295f
        if (hypotenuse > 50 && (angle < 30 && angle > -30 || angle > 60 || angle < -60)) {
            if (side1 <= 0 && side2 >= 0 && angle < 30 || side1 <= 0 && side2 <= 0 && angle > -30) {
                onSideFingerMovementCallback.onRight()
            } else if (side1 <= 0 && side2 >= 0 && angle > 60 || side1 >= 0 && side2 >= 0 && angle > 60) {
                onSideFingerMovementCallback.onUp()
            } else if (side1 >= 0 && side2 >= 0 && angle < 30 || side1 >= 0 && side2 <= 0 && angle > -30) {
                onSideFingerMovementCallback.onLeft()
            } else if (side1 >= 0 && side2 <= 0 && angle < -60 || side1 <= 0 && side2 <= 0 && angle < -60) {
                onSideFingerMovementCallback.onDown()
            }
        }
    }
}
