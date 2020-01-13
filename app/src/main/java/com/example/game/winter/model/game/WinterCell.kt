package com.example.game.winter.model.game

import com.example.game.common.model.game.cells.Cell
import com.example.game.winter.model.enums.WinterCellState

abstract class WinterCell(x:Int, y: Int): Cell(x, y) {

    abstract val state: WinterCellState
}