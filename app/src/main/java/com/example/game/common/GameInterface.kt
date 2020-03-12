package com.example.game.common

/**
 * Интерфейс реализующий главные функции взаимодействия с игрой
 */
interface GameInterface {

    /**
     * Начать играть уровень
     */
    fun start()

    /**
     * Уровень пройдет
     */
    fun win()

    /**
     * Начать уровень заново
     */
    fun restart()

    /**
     * Запустить следующий уровень
     */
    fun nextLevel()
}