package com.endana.app.presentation.screens.home


import StoreCard
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.endana.app.presentation.screens.home.component.FlashDealBanner
import com.endana.app.presentation.screens.home.component.Header
import com.endana.app.presentation.screens.home.component.LocationCard
import com.endana.app.presentation.screens.home.component.SectionHeader
import com.endana.app.presentation.screens.home.component.SectorTile
import com.endana.app.presentation.screens.home.model.sampleSectors
import com.endana.app.presentation.screens.home.model.sampleStores

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier.fillMaxSize()
    ) { inner ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(inner),
            contentPadding = PaddingValues(
                vertical = 12.dp,
                horizontal = 16.dp
            ),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                Header()
            }

            item {
                LocationCard()
            }
            item {
                FlashDealBanner()
            }
            item {
                SectionHeader(
                    title = "Hyperlocal Sectors",
                    trailing = "${sampleSectors.size} active",
                    modifier = Modifier.fillMaxWidth(),
                )
            }
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    sampleSectors.forEach { sector ->
                        SectorTile(
                            sector = sector,
                            modifier = Modifier.weight(1f),
                            onClick = { },
                        )
                    }
                }
            }
            item {
                SectionHeader(
                    title = "Popular Riverfront Spots",
                    trailing = " Instant Dispatch",
                    modifier = Modifier.fillMaxWidth(),
                )
            }

            itemsIndexed(
                items = sampleStores,
                key = { index, store -> "$index-${store.name}" },
            ) { _, store ->
                StoreCard(store = store, modifier = Modifier.fillMaxWidth(), onClick = {})
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewHomeScreen() {
    HomeScreen()
}