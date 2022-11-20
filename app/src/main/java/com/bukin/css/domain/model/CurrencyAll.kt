package com.bukin.css.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CurrencyAll(
    @PrimaryKey
    val name: String,
    val price: Double,
)