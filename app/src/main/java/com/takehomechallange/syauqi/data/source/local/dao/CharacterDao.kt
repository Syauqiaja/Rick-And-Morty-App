package com.takehomechallange.syauqi.data.source.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.takehomechallange.syauqi.data.source.local.entity.CharacterEntity

@Dao
interface CharacterDao {
    @Query("SELECT * FROM characters ORDER BY name DESC")
    fun getAllCharacters(): PagingSource<Int, CharacterEntity>

    @Query("DELETE FROM characters")
    suspend fun deleteAllCharacters()

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertCharacters(characterDatas: List<CharacterEntity>)

    @Query("SELECT * FROM characters WHERE name LIKE :query ORDER BY name DESC")
    fun searchCharacters(query: String): PagingSource<Int,CharacterEntity>
}