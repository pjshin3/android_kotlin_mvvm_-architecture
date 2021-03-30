package com.example.mymvvm.data

import androidx.room.Dao
import androidx.room.Query

@Dao
interface TmpDataDao{
    @Query("SELECT * FROM tmp")
    fun getTmpDataModel(): List<TmpDataModel>
}