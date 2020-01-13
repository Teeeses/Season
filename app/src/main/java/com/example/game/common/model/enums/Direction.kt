package com.example.game.common.model.enums

enum class Direction {
    UP,
    RIGHT,
    DOWN,
    LEFT;

    companion object {
        fun getDirection(char: Char): Direction {
            return when(char) {
                'U' -> UP
                'R' -> RIGHT
                'D' -> DOWN
                'L' -> LEFT
                else -> throw IllegalArgumentException("Невозможно перевести символ в Direction")
            }
        }
    }
}