package com.endana.app.presentation.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme: ColorScheme = darkColorScheme(
    primary = Emerald400,
    onPrimary = Ink,
    primaryContainer = Color(0x2634D399),
    onPrimaryContainer = Emerald400,

    secondary = Sky400,
    onSecondary = Ink,
    secondaryContainer = Color(0x2638BDF8),
    onSecondaryContainer = Sky400,

    tertiary = Amber500,
    onTertiary = Ink,
    tertiaryContainer = Color(0x26FBBF24),
    onTertiaryContainer = Amber300,

    error = Rose400,
    onError = Ink,
    errorContainer = Color(0x26F87171),
    onErrorContainer = Rose400,

    background = Ink,
    onBackground = Slate200,

    surface = Navy,
    onSurface = Slate200,
    surfaceVariant = Color(0x0DFFFFFF),
    onSurfaceVariant = Slate400,
    surfaceTint = Emerald400,

    surfaceDim = Ink,
    surfaceBright = NavyHighest,
    surfaceContainerLowest = Ink,
    surfaceContainerLow = Navy,
    surfaceContainer = Navy,
    surfaceContainerHigh = NavyRaised,
    surfaceContainerHighest = NavyHighest,

    outline = Slate500,
    outlineVariant = Color(0x14FFFFFF),

    inverseSurface = Slate200,
    inverseOnSurface = Ink,
    inversePrimary = Emerald500,
    scrim = Black,
)


private val LightColorScheme: ColorScheme = lightColorScheme(
    primary = Green600,
    onPrimary = White,
    primaryContainer = GreenTint,
    onPrimaryContainer = Green700,

    secondary = Indigo,
    onSecondary = White,
    secondaryContainer = Color(0x1A475D95),
    onSecondaryContainer = Indigo,

    tertiary = Honey,
    onTertiary = Black,
    tertiaryContainer = Honey,
    onTertiaryContainer = Black,

    background = Snow,
    onBackground = Black,

    surface = White,
    onSurface = Black,
    surfaceVariant = ChipGrey,
    onSurfaceVariant = GreyText,
    surfaceTint = Green600,

    surfaceDim = ChipGrey,
    surfaceBright = White,
    surfaceContainerLowest = White,
    surfaceContainerLow = White,
    surfaceContainer = White,
    surfaceContainerHigh = Snow,
    surfaceContainerHighest = ChipGrey,

    inverseSurface = Ink,
    inverseOnSurface = Slate200,
    inversePrimary = Emerald400,
    scrim = Black,
)

@Composable
fun EndanaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
//    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    val extraColors = if (darkTheme) DarkExtraColors else LightExtraColors

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content,
        typography = Typography
    )
}
