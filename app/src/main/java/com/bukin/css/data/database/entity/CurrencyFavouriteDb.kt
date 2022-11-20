package com.bukin.css.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import androidx.room.Relation

@Entity(
    tableName = "currency_favourite",
    indices = [
        Index("name", unique = true)
    ]
)
data class CurrencyFavouriteDb(
    @PrimaryKey @ColumnInfo(collate = ColumnInfo.NOCASE) val name: String,
    @Relation(

    )
    val price: Double,
)