package com.menezes.backend.client.dto

import jakarta.validation.constraints.NotBlank
import java.time.LocalDateTime

data class UserDTO(
    @NotBlank(message = "Nome é obrigatório")
    val name: String,
    @NotBlank(message = "CPF é obrigatório")
    val cpf: String,
    val address: String?,
    @NotBlank(message = "E-mail é obrigatório")
    val email: String,
    val phone: String?,
    val registrationDate: LocalDateTime?,
)
