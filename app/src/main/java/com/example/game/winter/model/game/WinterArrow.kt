package com.example.game.winter.model.game

import com.example.game.common.model.enums.Direction
import com.example.game.winter.model.enums.WinterCellState

class WinterArrow(x: Int, y: Int, val direction: Direction): WinterCell(x, y) {

    override val state: WinterCellState = WinterCellState.ARROW
}