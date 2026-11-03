package com.andana.app.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.endana.app.presentation.screens.home.component.Header
import com.endana.app.presentation.screens.home.component.LocationCard

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
//        containerColor = Surf,
//        bottomBar = { BottomBar(selected = tab, onSelect = { tab = it }) },
    ) { inner ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(inner)
                .background(MaterialTheme.colorScheme.background)
        ) {
            Header()
            LocationCard()
        }

//        @Composable

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewHomeScreen() {
    HomeScreen()
}