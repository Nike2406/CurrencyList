package com.bukin.css.data.database.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bukin.css.data.database.dao.CurrencyFavouriteDao
import com.bukin.css.data.database.entity.CurrencyFavouriteDb

@Database(
    entities = [CurrencyFavouriteDb::class],
    version = 1,
)
abstract class CurrencyFavouriteDatabase : RoomDatabase() {

    abstract fun CurrencyFavouriteDao(): CurrencyFavouriteDao
}