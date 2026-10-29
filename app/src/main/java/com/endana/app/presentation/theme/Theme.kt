package com.endana.app.presentation.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = MidnightNavy,
    onPrimary = SoftCreamLight,
    secondary = RoyalBlue,
    onSecondary = PureWhite,
    surface = SlateDarkBlue,
    onSurface = SoftCreamLight,
    background = BackgroundDark,
    onBackground = SoftCreamLight
)

private val LightColorScheme = lightColorScheme(
    primary = MidnightNavy,
    onPrimary = PureWhite,
    secondary = RoyalBlue,
    onSecondary = PureWhite,
    surface = PureWhite,
    onSurface = MidnightNavy,
    background = SoftCreamLight,
    onBackground = MidnightNavy
)

@Composable
fun EndanaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
//    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}