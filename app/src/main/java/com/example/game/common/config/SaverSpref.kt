package com.example.game.common.config

import android.content.Context
import android.content.SharedPreferences
import com.example.game.common.model.enums.Complication
import com.example.game.common.model.enums.Month
import java.util.ArrayList

class SaverSpref(context: Context) {

    private var sPref: SharedPreferences = context.getSharedPreferences(Utils.APP_PREFERENCES, Context.MODE_PRIVATE)

    fun saveCurrentLevel(currentLevel: Int, month: Month, complication: Complication) {
        if (month === Month.DECEMBER) {
            if (complication === Complication.EASY) {
                setCurrentWinterLevel(currentLevel, Utils.DECEMBER_EASY)
            } else if (complication === Complication.HARD) {
                setCurrentWinterLevel(currentLevel, Utils.DECEMBER_HARD)
            }
        } else if (month === Month.JANUARY) {
            if (complication === Complication.EASY) {
                setCurrentWinterLevel(currentLevel, Utils.JANUARY_EASY)
            } else if (complication === Complication.HARD) {
                setCurrentWinterLevel(currentLevel, Utils.JANUARY_HARD)
            }
        }
    }

    fun getArray(month: Month, complication: Complication): ArrayList<Int> {
        var array = ArrayList<Int>()
        if (month === Month.DECEMBER) {
            if (complication === Complication.EASY) {
                array = getArrayFromString(sPref.getString(Utils.DECEMBER_EASY, "0")!!)
            } else if (complication === Complication.HARD) {
                array = getArrayFromString(sPref.getString(Utils.DECEMBER_HARD, "0")!!)
            }
        } else if (month === Month.JANUARY) {
            if (complication === Complication.EASY) {
                array = getArrayFromString(sPref.getString(Utils.JANUARY_EASY, "0")!!)
            } else if (complication === Complication.HARD) {
                array = getArrayFromString(sPref.getString(Utils.JANUARY_HARD, "0")!!)
            }
        }
        return array
    }

    private fun setCurrentWinterLevel(currentLevel: Int, save: String) {
        println("Сохранение нового текущего уровня")
        val editor = sPref.edit()
        val str = sPref.getString(save, "0")
        if (!isLevelInArray(currentLevel, getArrayFromString(str!!))) {
            val newStr = addToString(currentLevel, str)
            editor.putString(save, newStr)
        }
        editor.apply()
    }

    private fun addToString(currentLevel: Int, str: String): String {
        return str + "|" + Integer.toString(currentLevel)
    }

    private fun isLevelInArray(currentLevel: Int, array: ArrayList<Int>): Boolean {
        return array.contains(currentLevel)
    }

    fun isLevelCompliated(month: Month, level: Int): Boolean {
        return isLevelInArray(level, getArray(month, Complication.EASY))
    }

    private fun getArrayFromString(str: String): ArrayList<Int> {
        val replaceStr = str.replace("[^0-9]+".toRegex(), " ")
        val array = ArrayList<Int>()
        val list = replaceStr.trim { it <= ' ' }.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (item in list) {
            array.add(Integer.parseInt(item))
        }
        return array
    }
}