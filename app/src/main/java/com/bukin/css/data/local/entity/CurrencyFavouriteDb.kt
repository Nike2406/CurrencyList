package com.bukin.css.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "currency_favourite",
    indices = [
        Index("name", unique = true)
    ],
    foreignKeys = [ForeignKey(
        entity = CurrencyDb::class,
        parentColumns = ["price"],
        childColumns = ["price"],
        onDelete = CASCADE
    )]
)
data class CurrencyFavouriteDb(
    @PrimaryKey
    @ColumnInfo(collate = ColumnInfo.NOCASE)
    val name: String,
    val price: Double,
)