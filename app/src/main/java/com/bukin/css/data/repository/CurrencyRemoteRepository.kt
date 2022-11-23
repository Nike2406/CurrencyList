package com.bukin.css.data.repository

import com.bukin.css.data.remote.CurrencyApi
import com.bukin.css.data.remote.pojo.CurrencyResponse
import com.bukin.css.data.local.dao.CurrencyDao
import com.bukin.css.data.local.dao.CurrencyFavouriteDao
import com.bukin.css.util.Resource
import javax.inject.Inject

class CurrencyRemoteRepository @Inject constructor(
    private val api: CurrencyApi,
    private val currencyDao: CurrencyDao,
    private val currencyFavouriteDao: CurrencyFavouriteDao,
) {

    suspend fun getRates(): Resource<CurrencyResponse> {
        return try {
            val response = api.getRates()
            val result = response.body()
            if (response.isSuccessful && result != null) {
                Resource.Success(result)
            } else {
                Resource.Error(response.message())
            }
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Error in DefaultMainRepository")
        }
    }
}