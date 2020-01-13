package com.example.game.winter.levels

import com.example.game.common.model.enums.ColorMember
import com.example.game.common.model.game.LevelField
import com.example.game.winter.model.game.WinterMember
import java.util.ArrayList

class JanuaryLevelHard {

    val levels: ArrayList<LevelField> = ArrayList()

    init {
        createLevels()
    }

    private fun createLevels() {

        levels.add(LevelField()
                .count(1)
                .addMember(
                        WinterMember()
                        .start(1, 0)
                        .end(3, 2)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(0, 0)
                        .end(4, 3)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(1, 1)
                        .end(3, 4)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('0', '0', '0', 'd', 'x'),
                        listOf('0', '0', '0', '0', 'd'),
                        listOf('x', 'x', 'x', '0', '0'),
                        listOf('x', '0', '0', '0', '0'),
                        listOf('x', 'x', '0', '0', 'x'))
                ))

        levels.add(LevelField()
                .count(2)
                .addMember(WinterMember()
                        .start(1, 2)
                        .end(0, 2)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(3, 1)
                        .end(2, 1)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(3, 3)
                        .end(0, 0)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('0', '0', '0', 'd'),
                        listOf('x', '0', '0', '0'),
                        listOf('x', '0', '0', '0'),
                        listOf('0', '0', 'u', '0'))
                ))

        levels.add(LevelField()
                .count(3)
                .addMember(WinterMember()
                        .start(3, 0)
                        .end(4, 4)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(3, 4)
                        .end(0, 4)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(3, 2)
                        .end(2, 4)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('r', '0', '0', '0', '0'),
                        listOf('0', '0', 'x', 'd', 'l'),
                        listOf('0', '0', 'x', '0', '0'),
                        listOf('0', '0', '0', '0', '0'),
                        listOf('0', '0', 'x', '0', '0'))
                ))

        levels.add(LevelField()
                .count(4)
                .addMember(WinterMember()
                        .start(3, 1)
                        .end(0, 3)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(3, 2)
                        .end(0, 2)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(3, 0)
                        .end(0, 1)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('x', '0', '0', '0'),
                        listOf('r', '0', '0', '0'),
                        listOf('0', '0', '0', 'l'),
                        listOf('0', '0', '0', 'x'))
                ))

        levels.add(LevelField()
                .count(5)
                .addMember(WinterMember()
                        .start(3, 4)
                        .end(2, 1)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(1, 4)
                        .end(2, 2)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(2, 4)
                        .end(2, 0)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('x', 'x', 'x', 'x', 'x'),
                        listOf('x', '0', 'd', 'x', '0'),
                        listOf('0', '0', '0', '0', '0'),
                        listOf('0', 'x', 'x', '0', '0'),
                        listOf('x', 'x', 'x', 'x', 'x'))
                ))

        levels.add(LevelField()
                .count(6)
                .addMember(WinterMember()
                        .start(4, 3)
                        .end(1, 0)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(4, 2)
                        .end(3, 4)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(4, 4)
                        .end(2, 0)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('x', '0', '0', 'l', 'x'),
                        listOf('0', '0', '0', '0', 'l'),
                        listOf('0', '0', '0', '0', '0'),
                        listOf('r', '0', '0', '0', '0'),
                        listOf('x', 'r', '0', '0', '0'))
                ))

        levels.add(LevelField()
                .count(7)
                .addMember(WinterMember()
                        .start(1, 0)
                        .end(4, 5)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(0, 0)
                        .end(5, 4)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(5, 1)
                        .end(3, 6)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('0', 'd', 'x', 'x', '0', 'd', 'x'),
                        listOf('0', '0', 'd', '0', '0', '0', 'd'),
                        listOf('x', '0', '0', '0', '0', '0', '0'),
                        listOf('0', '0', '0', '0', '0', '0', '0'),
                        listOf('0', '0', '0', '0', '0', '0', 'x'),
                        listOf('x', '0', '0', '0', '0', 'x', 'x'),
                        listOf('x', 'x', '0', '0', 'u', 'x', 'x'))
                ))

        levels.add(LevelField()
                .count(8)
                .addMember(WinterMember()
                        .start(4, 0)
                        .end(1, 2)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(0, 4)
                        .end(2, 1)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(2, 2)
                        .end(0, 0)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('0', '0', '0', 'd', '0'),
                        listOf('0', 'x', '0', '0', 'l'),
                        listOf('0', '0', '0', '0', '0'),
                        listOf('r', '0', '0', 'x', '0'),
                        listOf('0', 'u', '0', '0', '0'))
                ))

        levels.add(LevelField()
                .count(9)
                .addMember(WinterMember()
                        .start(3, 1)
                        .end(0, 0)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(2, 2)
                        .end(1, 0)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(3, 2)
                        .end(2, 0)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('0', '0', 'd', 'x'),
                        listOf('0', '0', '0', '0'),
                        listOf('0', 'u', '0', 'l'),
                        listOf('u', '0', '0', 'x'))
                ))

        levels.add(LevelField()
                .count(10)
                .addMember(WinterMember()
                        .start(2, 3)
                        .end(3, 4)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(1, 2)
                        .end(0, 4)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(2, 2)
                        .end(4, 4)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('0', '0', 'x', '0', '0'),
                        listOf('0', '0', '0', '0', '0'),
                        listOf('0', '0', '0', '0', 'x'),
                        listOf('u', '0', '0', '0', '0'),
                        listOf('0', '0', 'u', '0', '0'))
                ))

        levels.add(LevelField()
                .count(11)
                .addMember(WinterMember()
                        .start(1, 2)
                        .end(3, 4)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(1, 4)
                        .end(4, 4)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(1, 3)
                        .end(0, 3)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('x', 'x', 'd', '0', 'l'),
                        listOf('x', '0', '0', '0', '0'),
                        listOf('0', '0', '0', '0', 'x'),
                        listOf('0', '0', 'x', '0', '0'),
                        listOf('x', 'x', 'x', '0', '0'))
                ))

        levels.add(LevelField()
                .count(12)
                .addMember(WinterMember()
                        .start(2, 2)
                        .end(1, 0)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(0, 4)
                        .end(1, 2)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(0, 0)
                        .end(1, 1)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('0', 'r', '0', '0', '0'),
                        listOf('0', '0', '0', '0', 'l'),
                        listOf('r', '0', '0', '0', '0'),
                        listOf('0', '0', 'x', '0', '0'),
                        listOf('x', 'x', 'x', '0', 'u'))
                ))

        levels.add(LevelField()
                .count(13)
                .addMember(WinterMember()
                        .start(2, 4)
                        .end(3, 3)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(1, 4)
                        .end(4, 3)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(2, 1)
                        .end(4, 0)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('r', '0', '0', '0', 'x'),
                        listOf('0', '0', '0', '0', '0'),
                        listOf('0', '0', '0', '0', '0'),
                        listOf('0', 'x', 'u', '0', 'x'),
                        listOf('0', '0', '0', '0', 'x'))
                ))

        levels.add(LevelField()
                .count(14)
                .addMember(WinterMember()
                        .start(4, 1)
                        .end(2, 0)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(4, 2)
                        .end(4, 3)
                        .color(ColorMember.BLUE)).addMember(WinterMember()
                        .start(4, 3)
                        .end(0, 3)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('0', '0', '0', '0', '0'),
                        listOf('0', 'x', 'x', '0', '0'),
                        listOf('0', '0', 'x', 'u', '0'),
                        listOf('x', '0', '0', '0', 'l'),
                        listOf('r', '0', '0', '0', 'x'))
                ))

        levels.add(LevelField()
                .count(15)
                .addMember(WinterMember()
                        .start(4, 2)
                        .end(0, 0)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(4, 1)
                        .end(1, 0)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(4, 3)
                        .end(0, 2)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('0', '0', '0', '0', '0'),
                        listOf('0', 'x', '0', '0', '0'),
                        listOf('0', 'x', 'r', '0', 'x'),
                        listOf('u', '0', '0', '0', '0'),
                        listOf('r', '0', '0', '0', '0'))
                ))

        levels.add(LevelField()
                .count(16)
                .addMember(WinterMember()
                        .start(4, 4)
                        .end(3, 4)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(3, 4)
                        .end(3, 2)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(4, 0)
                        .end(4, 2)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('r', '0', '0', '0', '0'),
                        listOf('0', 'x', 'd', '0', 'l'),
                        listOf('0', '0', '0', '0', 'x'),
                        listOf('0', 'r', '0', '0', '0'),
                        listOf('0', 'x', '0', '0', '0'))
                ))

        levels.add(LevelField()
                .count(17)
                .addMember(WinterMember()
                        .start(4, 3)
                        .end(0, 2)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(2, 5)
                        .end(0, 4)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(3, 4)
                        .end(0, 3)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('x', 'd', '0', '0', '0', 'l'),
                        listOf('x', '0', '0', 'l', '0', '0'),
                        listOf('0', '0', 'l', '0', '0', '0'),
                        listOf('0', 'r', '0', '0', '0', 'x'),
                        listOf('0', '0', '0', '0', 'x', 'x'),
                        listOf('x', '0', '0', 'x', 'x', 'x'))
                ))

        levels.add(LevelField()
                .count(18)
                .addMember(WinterMember()
                        .start(3, 0)
                        .end(0, 3)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(4, 1)
                        .end(1, 4)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(2, 2)
                        .end(1, 3)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('x', 'x', '0', '0', 'x'),
                        listOf('r', '0', '0', '0', '0'),
                        listOf('0', 'x', '0', '0', '0'),
                        listOf('0', 'x', 'x', '0', 'u'),
                        listOf('x', '0', '0', 'u', 'x'))
                ))

        levels.add(LevelField()
                .count(19)
                .addMember(WinterMember()
                        .start(0, 4)
                        .end(0, 4)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(2, 0)
                        .end(1, 0)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(1, 0)
                        .end(2, 0)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('d', '0', 'x', 'd', '0'),
                        listOf('0', '0', 'l', '0', '0'),
                        listOf('0', '0', '0', 'l', '0'),
                        listOf('r', '0', '0', '0', '0'),
                        listOf('x', 'x', 'x', '0', 'u'))
                ))

        levels.add(LevelField()
                .count(20)
                .addMember(WinterMember()
                        .start(5, 5)
                        .end(0, 2)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(5, 4)
                        .end(4, 5)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(1, 0)
                        .end(0, 5)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('x', '0', '0', 'x', 'd', '0'),
                        listOf('0', '0', '0', '0', '0', '0'),
                        listOf('r', '0', '0', 'x', '0', 'x'),
                        listOf('x', '0', 'x', 'x', 'x', 'x'),
                        listOf('x', '0', '0', '0', '0', '0'),
                        listOf('x', 'x', 'x', 'u', '0', '0'))
                ))

        levels.add(LevelField()
                .count(21)
                .addMember(WinterMember()
                        .start(2, 4)
                        .end(6, 4)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(4, 2)
                        .end(6, 3)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(3, 3)
                        .end(3, 6)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('x', 'x', '0', '0', 'x', 'x', 'x'),
                        listOf('x', 'x', '0', '0', '0', 'x', 'x'),
                        listOf('x', '0', '0', 'r', '0', '0', '0'),
                        listOf('0', '0', 'u', 'x', 'd', '0', '0'),
                        listOf('0', '0', '0', 'l', '0', '0', 'x'),
                        listOf('x', 'x', '0', '0', '0', 'x', 'x'),
                        listOf('x', 'x', 'x', '0', '0', 'x', 'x'))
                ))

        levels.add(LevelField()
                .count(22)
                .addMember(WinterMember()
                        .start(5, 3)
                        .end(1, 0)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(4, 4)
                        .end(2, 2)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(4, 3)
                        .end(3, 1)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('x', 'x', 'x', 'd', 'x', 'x'),
                        listOf('0', '0', 'x', '0', '0', '0'),
                        listOf('0', '0', '0', '0', '0', '0'),
                        listOf('x', '0', '0', 'l', 'x', 'x'),
                        listOf('x', '0', 'u', '0', '0', 'x'),
                        listOf('x', 'u', 'x', '0', 'x', 'x'))
                ))

        levels.add(LevelField()
                .count(23)
                .addMember(WinterMember()
                        .start(4, 0)
                        .end(5, 3)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(5, 0)
                        .end(0, 2)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(0, 4)
                        .end(0, 0)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('0', '0', '0', 'x', '0', 'x'),
                        listOf('0', '0', '0', 'l', '0', '0'),
                        listOf('x', 'x', 'u', 'x', 'x', '0'),
                        listOf('x', 'x', '0', 'l', '0', '0'),
                        listOf('0', '0', '0', 'x', 'x', 'x'),
                        listOf('0', '0', '0', '0', 'x', 'x'))
                ))

        levels.add(LevelField()
                .count(24)
                .addMember(WinterMember()
                        .start(5, 2)
                        .end(3, 1)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(5, 3)
                        .end(3, 3)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(5, 4)
                        .end(2, 2)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('0', '0', 'x', 'x', '0', 'x'),
                        listOf('0', '0', '0', 'd', '0', '0'),
                        listOf('x', '0', 'x', '0', 'x', '0'),
                        listOf('x', '0', '0', '0', 'x', '0'),
                        listOf('0', '0', 'x', 'x', 'x', '0'),
                        listOf('x', 'u', '0', '0', '0', '0'))
                ))

        levels.add(LevelField()
                .count(25)
                .addMember(WinterMember()
                        .start(4, 3)
                        .end(4, 0)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(3, 4)
                        .end(4, 1)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(4, 4)
                        .end(3, 0)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('0', '0', 'x', '0', '0'),
                        listOf('0', '0', 'r', '0', '0'),
                        listOf('x', '0', 'x', '0', 'x'),
                        listOf('0', '0', 'l', '0', '0'),
                        listOf('0', '0', 'x', '0', '0'))
                ))

        levels.add(LevelField()
                .count(26)
                .addMember(WinterMember()
                        .start(6, 3)
                        .end(3, 5)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(6, 2)
                        .end(2, 5)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(5, 2)
                        .end(4, 5)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('x', 'x', 'r', '0', '0', '0', 'x'),
                        listOf('x', '0', '0', 'x', 'x', 'd', 'x'),
                        listOf('0', '0', '0', 'x', 'x', '0', 'x'),
                        listOf('x', 'u', 'x', 'x', '0', '0', '0'),
                        listOf('x', '0', 'x', 'x', '0', '0', '0'),
                        listOf('r', '0', '0', 'x', 'x', 'x', 'x'),
                        listOf('x', '0', '0', '0', 'l', 'x', 'x'))
                ))

        levels.add(LevelField()
                .count(27)
                .addMember(WinterMember()
                        .start(3, 4)
                        .end(3, 0)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(0, 2)
                        .end(3, 1)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(0, 3)
                        .end(0, 2)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('x', 'x', '0', '0', 'x'),
                        listOf('x', '0', '0', '0', 'x'),
                        listOf('r', '0', '0', 'x', 'x'),
                        listOf('0', '0', '0', '0', '0'),
                        listOf('0', '0', '0', 'l', 'x'))
                ))

        levels.add(LevelField()
                .count(28)
                .addMember(WinterMember()
                        .start(3, 4)
                        .end(3, 4)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(5, 2)
                        .end(6, 2)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(5, 5)
                        .end(0, 1)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('x', '0', '0', 'x', '0', '0', 'x'),
                        listOf('0', '0', '0', 'd', '0', '0', 'x'),
                        listOf('0', '0', '0', '0', '0', '0', 'x'),
                        listOf('x', 'u', 'x', '0', '0', '0', 'x'),
                        listOf('x', '0', '0', '0', 'x', '0', '0'),
                        listOf('x', '0', '0', 'x', 'x', '0', '0'),
                        listOf('0', '0', '0', 'r', '0', '0', '0'))
                ))

        levels.add(LevelField()
                .count(29)
                .addMember(WinterMember()
                        .start(3, 2)
                        .end(2, 2)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(3, 4)
                        .end(5, 0)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(4, 3)
                        .end(3, 1)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('0', '0', 'x', '0', '0', 'x', 'x'),
                        listOf('0', '0', '0', '0', '0', 'x', 'x'),
                        listOf('r', '0', '0', 'x', '0', '0', '0'),
                        listOf('x', '0', '0', 'd', '0', 'x', '0'),
                        listOf('x', '0', 'x', '0', 'x', 'x', '0'),
                        listOf('0', '0', 'r', '0', '0', '0', '0'),
                        listOf('x', '0', 'x', '0', '0', '0', '0'))
                ))

        levels.add(LevelField()
                .count(30)
                .addMember(WinterMember()
                        .start(6, 2)
                        .end(0, 3)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(4, 2)
                        .end(4, 1)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(5, 2)
                        .end(3, 6)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('0', '0', 'x', '0', '0', '0', '0'),
                        listOf('0', '0', '0', '0', 'x', '0', '0'),
                        listOf('0', '0', '0', '0', 'x', 'd', 'x'),
                        listOf('u', 'x', 'x', 'd', 'x', '0', '0'),
                        listOf('0', '0', '0', '0', 'x', '0', '0'),
                        listOf('x', '0', '0', '0', 'l', '0', '0'),
                        listOf('x', 'x', '0', '0', 'x', '0', '0'))
                ))

        levels.add(LevelField()
                .count(31)
                .addMember(WinterMember()
                        .start(7, 0)
                        .end(4, 3)
                        .color(ColorMember.RED))
                .addMember(WinterMember()
                        .start(5, 0)
                        .end(2, 0)
                        .color(ColorMember.BLUE))
                .addMember(WinterMember()
                        .start(6, 0)
                        .end(3, 4)
                        .color(ColorMember.YELLOW))
                .field(listOf(
                        listOf('x', 'x', '0', '0', '0', 'l', '0', '0'),
                        listOf('0', '0', '0', 'r', '0', '0', '0', '0'),
                        listOf('0', '0', 'x', 'x', 'u', 'x', '0', '0'),
                        listOf('0', '0', 'r', '0', '0', 'x', 'u', 'x'),
                        listOf('x', 'd', 'x', '0', '0', 'l', '0', '0'),
                        listOf('0', '0', 'x', 'd', 'x', 'x', '0', '0'),
                        listOf('0', '0', '0', '0', 'l', '0', '0', '0'),
                        listOf('0', '0', 'r', '0', '0', '0', 'x', 'x'))
                ))
    }
}