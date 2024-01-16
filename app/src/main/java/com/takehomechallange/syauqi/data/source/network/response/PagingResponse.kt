package com.takehomechallange.syauqi.data.source.network.response

import com.google.gson.annotations.SerializedName

data class PagingResponse<T>(

    @field:SerializedName("results")
    val results: List<T>? = null,

    @field:SerializedName("info")
    val info: PagingInfo
)
data class PagingInfo(

    @field:SerializedName("next")
    val next: String? = null,

    @field:SerializedName("pages")
    val pages: Int,

    @field:SerializedName("prev")
    val prev: String? = null,

    @field:SerializedName("count")
    val count: Int
)