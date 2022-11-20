package com.bukin.css.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class CurrencyFavorites(
    @PrimaryKey
    val name: String,
    val price: Double,
)