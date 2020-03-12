package com.example.game.common.model.game

import android.os.Parcelable
import com.example.game.common.model.enums.Month
import kotlinx.android.parcel.Parcelize

@Parcelize
data class OpenGameConfiguration(val level: Int, val month: Month) : Parcelable