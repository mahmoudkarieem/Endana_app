package com.endana.app.presentation.component


import androidx.annotation.DrawableRes
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

enum class HomeTab(val label: String, @DrawableRes val iconRes: Int) {
    Hub("Hub", com.endana.app.R.drawable.baseline_storefront_24),
    Search("Search", com.endana.app.R.drawable.baseline_search_24),
    Orders("Orders", com.endana.app.R.drawable.baseline_receipt_long_24),
    Profile("Profile", com.endana.app.R.drawable.baseline_person_outline_24),
}


@Composable
fun AndanaBottomBar(
    selected: HomeTab,
    onSelect: (HomeTab) -> Unit,
    modifier: Modifier = Modifier,
) {
    val scheme = MaterialTheme.colorScheme

    NavigationBar(
        modifier = modifier,
        containerColor = scheme.surface,
        tonalElevation = 0.dp,
    ) {
        HomeTab.entries.forEach { tab ->
            val isSelected = tab == selected
            NavigationBarItem(
                selected = isSelected,
                onClick = { onSelect(tab) },

                icon = {
                    Icon(
                        painter = painterResource(id = tab.iconRes),
                        contentDescription = tab.label, // 3. Set contentDescription for accessibility
                    )
                },
                label = {
                    Text(
                        tab.label,
                        fontSize = 10.sp,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.SemiBold,
                    )
                },
                alwaysShowLabel = true,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = scheme.primary,
                    selectedTextColor = scheme.primary,
                    unselectedIconColor = scheme.onSurfaceVariant,
                    unselectedTextColor = scheme.onSurfaceVariant,
                    indicatorColor = Color.Transparent,
                ),
            )
        }
    }
}