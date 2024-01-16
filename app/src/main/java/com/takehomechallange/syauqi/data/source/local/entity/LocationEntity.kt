package com.takehomechallange.syauqi.data.source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "locations")
data class LocationEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val name: String,
    val type: String,
    val dimension: String,
)
