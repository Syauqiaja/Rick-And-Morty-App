package com.takehomechallange.syauqi.data.source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.takehomechallange.syauqi.data.source.network.response.LocationItem

@Entity(tableName = "characters")
data class CharacterEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val image: String,
    val gender: String,
    val species: String,
    val originId: Int? = null,
    val name: String,
    val locationId: Int? = null,
    val episode: List<String>? = null,
    val status: String
)
