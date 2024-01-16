package com.takehomechallange.syauqi.data.source.network.service

import androidx.paging.PagingData
import com.takehomechallange.syauqi.data.source.network.response.CharacterResponse
import com.takehomechallange.syauqi.data.source.network.response.LocationResponse
import com.takehomechallange.syauqi.data.source.network.response.PagingResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("character")
    suspend fun getAllCharacter(): PagingData<PagingResponse<CharacterResponse>>

    @GET("location/{id}")
    suspend fun getLocationById(
        @Path("id") id: Int
    ): LocationResponse
}