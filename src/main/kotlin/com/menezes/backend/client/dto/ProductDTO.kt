package com.menezes.backend.client.dto
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

data class ProductDTO(
    @NotBlank
    val productIdentifier: String,
    @NotBlank
    val name: String,
    @NotBlank
    val description: String,
    @NotNull
    val price: Float,
    @NotNull
    val category: CategoryDTO,
)
