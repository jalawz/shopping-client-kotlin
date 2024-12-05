package com.menezes.backend.client.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.time.LocalDateTime

data class ShopDTO(
    @NotBlank
    val userIdentifier: String,
    @NotNull
    val total: Float,
    @NotNull
    val date: LocalDateTime = LocalDateTime.now(),
    @NotNull
    val items: List<ItemDTO> = emptyList()
)

data class ItemDTO(
    @NotBlank
    val productIdentifier: String,
    @NotNull
    var price: Float
)