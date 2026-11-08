package com.endana.app.presentation.screens.home.model

import com.endana.app.R

data class Store(
    val name: String,
    val subtitle: String,
    val eta: String,
    val rating: String,
    val imageRes: Int
)


val sampleStores = listOf(
    Store(
        "Al-Omda Grill & Kabab",
        "Zefta Riverfront • Charcoal Platters & Fresh Bread",
        "15-20 min ETA",
        "4.9",
        R.drawable.resturant
    ),
    Store(
        "El-Madina Pharmacy",
        "Open 24/7 • Prescription & Emergency Drop", "5-10 min ETA", "4.8",
        R.drawable.pharmacy
    ),
    Store(
        "Al-Omda Grill & Kabab",
        "Zefta Riverfront • Charcoal Platters & Fresh Bread",
        "15-20 min ETA",
        "4.9", R.drawable.resturant
    ),
    Store(
        "El-Madina Pharmacy",
        "Open 24/7 • Prescription & Emergency Drop", "5-10 min ETA", "4.8",
        R.drawable.pharmacy
    ),
)