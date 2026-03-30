package com.example.pays.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class Country(
    @StringRes val nomResId: Int,
    @StringRes val capitaleResId: Int,
    val code: String,
    @DrawableRes val drapeauResId: Int
)
