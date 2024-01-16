package com.takehomechallange.syauqi.data.source.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.takehomechallange.syauqi.data.source.local.entity.LocationEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LocationDao {
    @Query("SELECT * FROM locations WHERE id == :id LIMIT 1")
    fun getLocationById(id: Int): Flow<LocationEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLocations(locationDatas: List<LocationEntity>)

    @Query("DELETE FROM locations")
    suspend fun deleteAllLocation()
}