package com.bukin.css.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bukin.css.data.database.entity.CurrencyDb
import com.bukin.css.data.database.entity.SortedValue

@Dao
interface CurrencyDao {

    @Query("SELECT * FROM currency")
    suspend fun getAll(): List<CurrencyDb>

    /*
    * TODO: init sortedValue in ViewModel
    *   https://stackoverflow.com/questions/48769812/best-practice-runtime-filters-with-room-and-livedata
    * */
    @Query("SELECT * FROM currency ORDER BY :sortedValue")
    suspend fun getListBySortValue(sortedValue: SortedValue): List<CurrencyDb>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCurrency(currencies: List<CurrencyDb>)
}