package com.openclassrooms.p8vitesse.domain.model

data class Candidate(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val phone: String,
    val email: String,
    val salaryExpectation: Double,
    val note: String,
    val profilePicture: String? = null // Peut être nul si aucune photo n'est ajoutée
)
