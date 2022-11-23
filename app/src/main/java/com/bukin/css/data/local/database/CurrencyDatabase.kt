package com.bukin.css.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bukin.css.data.local.dao.CurrencyDao
import com.bukin.css.data.local.entity.CurrencyDb

@Database(
    entities = [CurrencyDb::class],
    version = 1,
)
abstract class CurrencyDatabase : RoomDatabase() {

    abstract fun CurrencyDao(): CurrencyDao
}