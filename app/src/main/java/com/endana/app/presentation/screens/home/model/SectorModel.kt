package com.endana.app.presentation.screens.home.model

import androidx.compose.ui.graphics.Color

data class Sector(
    val title: String,
    val subtitle: String,
    val icon: Int,
    val tint: Color,
    val bg: Color,
)
val sampleSectors = listOf(
    Sector(
        "Food",
        "Charcoal",
        com.endana.app.R.drawable.icon_resturant,
        Color(0xFFEA580C),
        Color(0xFFFFF7ED)
    ),
    Sector(
        "Grocery",
        "Baladi Souq",
        com.endana.app.R.drawable.icon_food,
        Color(0xFF059669),
        Color(0xFFECFDF5)
    ),
    Sector(
        "Pharmacy",
        "24/7 Rx",
        com.endana.app.R.drawable.icon_pharmcy,
        Color(0xFF2563EB),
        Color(0xFFEFF6FF)
    ),
    Sector(
        "Special", "Mit Ghamr",
        com.endana.app.R.drawable.margin, Color(0xFF4F46E5), Color(0xFFEEF2FF)
    ),
)
