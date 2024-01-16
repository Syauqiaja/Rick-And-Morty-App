package com.takehomechallange.syauqi.data.source.local

import androidx.room.Database
import com.takehomechallange.syauqi.data.source.local.entity.RemoteKeys
import com.takehomechallange.syauqi.data.source.local.entity.CharacterEntity
import com.takehomechallange.syauqi.data.source.local.entity.LocationEntity

@Database(
    entities = [CharacterEntity::class, LocationEntity::class, RemoteKeys::class],
    version = 1,
    exportSchema = false
)
abstract class RickMortyDatabase {
}