package com.example.game.winter.model.game

import com.example.game.winter.model.enums.WinterCellState

class WinterWall(x: Int, y: Int): WinterCell(x, y) {

    override val state: WinterCellState = WinterCellState.WALL
}