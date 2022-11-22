package com.bukin.css.data.database.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bukin.css.data.database.dao.CurrencyDao
import com.bukin.css.data.database.entity.CurrencyDb

@Database(
    entities = [CurrencyDb::class],
    version = 1,
)
abstract class CurrencyDatabase : RoomDatabase() {

    abstract fun CurrencyDao(): CurrencyDao
}