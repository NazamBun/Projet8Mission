package com.openclassrooms.p8vitesse.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface CandidateDao {

    @Query("SELECT * FROM candidates")
    fun getAllCandidates(): Flow<List<CandidateDto>> // Utilise Flow pour émettre automatiquement les mises à jour

    @Query("SELECT * FROM candidates WHERE id = :id")
    suspend fun getCandidateById(id: Long): CandidateDto?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCandidate(candidate: CandidateDto)

    @Delete
    suspend fun deleteCandidate(candidate: CandidateDto)

    @Update
    suspend fun updateCandidate(candidate: CandidateDto)
}