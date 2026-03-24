package com.example.pays.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class Country(
    @StringRes val nomResId: Int,
    @StringRes val capitaleResId: Int,
    val code: String, // Le code ISO (ex: "CD") peut rester en String simple
    @DrawableRes val drapeauResId: Int
)
