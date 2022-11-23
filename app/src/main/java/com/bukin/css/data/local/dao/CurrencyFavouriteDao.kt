package com.bukin.css.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bukin.css.data.local.entity.CurrencyDb
import com.bukin.css.data.local.entity.CurrencyFavouriteDb
import com.bukin.css.data.local.entity.SortedValue

@Dao
interface CurrencyFavouriteDao {

    @Query("SELECT * FROM currency_favourite")
    suspend fun getAll(): List<CurrencyDb>

    /*
    * TODO: init sortedValue in ViewModel
    *   https://stackoverflow.com/questions/48769812/best-practice-runtime-filters-with-room-and-livedata
    * */
    @Query("SELECT * FROM currency ORDER BY :sortedValue")
    suspend fun getListBySortValue(sortedValue: SortedValue): List<CurrencyFavouriteDb>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCurrency(currencies: List<CurrencyFavouriteDb>)

    @Delete
    suspend fun deleteCurrency(currencyFavouriteDb: CurrencyFavouriteDb)
}