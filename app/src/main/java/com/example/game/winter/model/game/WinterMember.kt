package com.example.game.winter.model.game

import com.example.game.common.model.Coordinate
import com.example.game.common.model.enums.ColorMember
import com.example.game.common.model.game.cells.Member

class WinterMember(x: Int = 0, y: Int = 0): Member(x, y) {

    private lateinit var start: Coordinate
    private lateinit var end: Coordinate

    fun start(x: Int, y: Int) = apply {
        this.start = Coordinate(x, y)
        this.x = x
        this.y = y
    }

    fun end(x: Int, y: Int) = apply {
        this.end = Coordinate(x, y)
    }

    fun color(color: ColorMember) = apply {
        this.color = color
    }
}