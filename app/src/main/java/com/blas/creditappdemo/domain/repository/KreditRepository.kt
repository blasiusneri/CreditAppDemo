package com.blas.creditappdemo.domain.repository

import com.blas.creditappdemo.data.model.KreditResponse

interface KreditRepository {
    suspend fun getKreditStatus(): KreditResponse
}