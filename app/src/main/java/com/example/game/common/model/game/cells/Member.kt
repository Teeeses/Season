package com.example.game.common.model.game.cells

import com.example.game.common.model.enums.ColorMember

open class Member(x: Int, y: Int, var color: ColorMember = ColorMember.RED) : Cell(x, y) {

}