package com.bukin.css.data.remote

import com.bukin.css.data.remote.pojo.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CurrencyApi {

    @Headers("apikey: $QUERY_API_KEY")
    @GET("/exchangerates_data/latest?")
    suspend fun getRates(
        @Query(QUERY_SYMBOLS) symbols: String = QUERY_SYMBOLS,
        @Query(QUERY_BASE) base: String = QUERY_BASE,
    ): Response<CurrencyResponse>

    companion object {

        private const val QUERY_API_KEY = "WLOhzEUp4kApr1ifbY2YrsI4EMBIebnF"
        private const val QUERY_SYMBOLS = "symbols"
        private const val QUERY_BASE = "base"
    }
}