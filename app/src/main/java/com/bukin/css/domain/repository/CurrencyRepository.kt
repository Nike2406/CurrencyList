package com.bukin.css.domain.repository

import com.bukin.css.data.remote.pojo.CurrencyResponse
import com.bukin.css.util.Resource

interface CurrencyRepository {

    suspend fun getRates(): Resource<CurrencyResponse>
}