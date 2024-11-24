package com.openclassrooms.p8vitesse.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "candidates")
class CandidateDto(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val photo: String,
    val prenom: String,
    val nom: String,
    val telephone: String,
    val dateNaissance: Long,
    val pretentionSalariale: Double?,
    val note: String?
    ) {
}