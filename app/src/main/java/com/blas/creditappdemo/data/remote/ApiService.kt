package com.blas.creditappdemo.data.remote

import com.blas.creditappdemo.data.model.KreditResponse
import retrofit2.http.GET

interface ApiService {
    @GET("kredit/status")
    suspend fun getKreditStatus(): KreditResponse
}