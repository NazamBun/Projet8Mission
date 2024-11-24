package com.openclassrooms.p8vitesse.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [CandidateDto::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun candidateDao(): CandidateDao
}