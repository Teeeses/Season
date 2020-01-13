package com.example.game.winter.factories

import com.example.game.common.model.enums.Direction
import com.example.game.common.model.game.cells.Cell
import com.example.game.winter.model.game.WinterArrow
import com.example.game.winter.model.game.WinterEmpty
import com.example.game.winter.model.game.WinterWall

class WinterCellFactory {

    fun getData(x: Int, y: Int, data: Char): Cell {
        return when(data) {
            '0' -> WinterEmpty(x, y)
            'X' -> WinterWall(x, y)
            else -> WinterArrow(x, y, Direction.getDirection(data))
        }
    }
}