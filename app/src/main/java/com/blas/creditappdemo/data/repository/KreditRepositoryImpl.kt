package com.blas.creditappdemo.data.repository

import com.blas.creditappdemo.data.model.KreditResponse
import com.blas.creditappdemo.data.remote.ApiService
import com.blas.creditappdemo.domain.repository.KreditRepository
import javax.inject.Inject

class KreditRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : KreditRepository {
    override suspend fun getKreditStatus(): KreditResponse {
        return apiService.getKreditStatus()
    }
}