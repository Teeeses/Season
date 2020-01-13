package com.example.game.common.factories

abstract class BaseFactory<T, E> {

    abstract fun getData(data: T): E
}