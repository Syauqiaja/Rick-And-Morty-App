package com.takehomechallange.syauqi.data.source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("remote_keys")
data class RemoteKeys(
    @PrimaryKey
    val id : Int,
    val prevKey: Int?,
    val nextKey: Int?
)