package com.bukin.css.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "currency",
    indices = [
        Index("name", unique = true)
    ]
)
data class CurrencyDb(
    @PrimaryKey @ColumnInfo(collate = ColumnInfo.NOCASE) val name: String,
    val price: Double,
)