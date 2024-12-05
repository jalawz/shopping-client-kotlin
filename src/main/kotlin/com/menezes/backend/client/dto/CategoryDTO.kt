package com.menezes.backend.client.dto

import jakarta.validation.constraints.NotNull

data class CategoryDTO(
    @NotNull
    val id: Long,
    val name: String?,
)
