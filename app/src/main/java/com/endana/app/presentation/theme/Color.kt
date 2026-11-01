package com.endana.app.presentation.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
//val MidnightNavy = Color(0xFF010736)
//val SlateDarkBlue = Color(0xFF0D1C42)
//val RoyalBlue = Color(0xFF22396F)
//val SoftCreamLight = Color(0xFFFCF1D0)
//val BackgroundDark = Color(0xFF010526)
//val PureWhite = Color(0xFFFFFFFF)
//val OffWhiteSurface = Color(0xFFF8F9FA)
//
//val WhatsAppGreen = Color(0xFF25D366)
//val ActionGreen = Color(0xFF1FA34A)
//val WarmAmber = Color(0xFFFFB703)
//val CyberTeal = Color(0xFF00B4D8)
//ANDANA — RAW PALETTE
//  Every value below comes from the Figma file "Andana App Store":
//    • Dark  = "Glassmorphic Neu-Dark", node 1:5167 (6-screen flow)
//    • Light = Home screen, node 1:3371
//  Screens should NOT use these directly — read them through
//  MaterialTheme.colorScheme.* or MaterialTheme.andanaColors.* (Theme.kt).
// =====================================================================

// ---- Dark: backgrounds & glass ------------------------------------
internal val Ink = Color(0xFF07090E)            // screen background
internal val Navy = Color(0xFF121824)           // card base (glass is Navy @ 82–90%)
internal val NavyRaised = Color(0xFF1E242F)     // Navy + 5% white
internal val NavyHighest = Color(0xFF252A36)    // Navy + 8% white

// ---- Dark: text greys (Slate) -------------------------------------
internal val Slate200 = Color(0xFFE2E8F0)       // primary text
internal val Slate400 = Color(0xFF94A3B8)       // secondary text
internal val Slate500 = Color(0xFF64748B)       // hints, inactive nav

// ---- Dark: accents -------------------------------------------------
internal val Emerald400 = Color(0xFF34D399)     // brand accent
internal val Emerald500 = Color(0xFF10B981)     // WhatsApp handoff
internal val Sky400 = Color(0xFF38BDF8)         // logistics / ETA
internal val Amber500 = Color(0xFFF59E0B)       // "Limited time" badge
internal val Amber300 = Color(0xFFFCD34D)       // ratings, chef's pick
internal val Rose400 = Color(0xFFFB7185)        // "Clear", errors

// ---- Light (Home screen) ------------------------------------------
internal val Snow = Color(0xFFF8F9FA)           // screen background
internal val White = Color(0xFFFFFFFF)
internal val Black = Color(0xFF000000)
internal val GreyText = Color(0xFF46464F)       // secondary text
internal val ChipGrey = Color(0xFFEDEEEF)       // language switch, chips
internal val Indigo = Color(0xFF475D95)         // ETA badges, links
internal val Green600 = Color(0xFF059669)       // brand green
internal val Green700 = Color(0xFF047857)       // active nav label
internal val GreenTint = Color(0xFFECFDF5)      // grocery tile
internal val Honey = Color(0xFFFFB703)          // flash-deal banner

// =====================================================================
//  EXTRA SEMANTIC COLORS (things Material 3 has no slot for)
//  Usage:  MaterialTheme.andanaColors.success
// =====================================================================
@Immutable
data class AndanaExtraColors(
    val success: Color,
    val successContainer: Color,
    val info: Color,
    val infoContainer: Color,
    val warning: Color,
    val warningContainer: Color,
    val rating: Color,          // ★ stars
    val glass: Color,           // frosted card fill
    val glassStrong: Color,     // frosted profile card fill
    val glassBorder: Color,     // 1dp hairline on glass
    val glow: Color,            // soft outer glow on featured card
    val glowBorder: Color,      // neon outline on featured card
    val overlayChip: Color,     // chips sitting on top of photos
)

val DarkExtraColors = AndanaExtraColors(
    success = Emerald400,
    successContainer = Color(0x2634D399),   // Emerald @15%
    info = Sky400,
    infoContainer = Color(0x2638BDF8),      // Sky @15%
    warning = Amber500,
    warningContainer = Color(0x26FBBF24),   // Amber @15%
    rating = Amber300,
    glass = Color(0xD1121824),              // Navy @82%
    glassStrong = Color(0xE6121824),        // Navy @90%
    glassBorder = Color(0x14FFFFFF),        // White @8%
    glow = Color(0x3300E676),               // Neon @20%
    glowBorder = Color(0x6600E676),         // Neon @40%
    overlayChip = Color(0x99000000),        // Black @60%
)

val LightExtraColors = AndanaExtraColors(
    success = Green600,
    successContainer = GreenTint,
    info = Indigo,
    infoContainer = Color(0x1A475D95),      // Indigo @10%
    warning = Honey,
    warningContainer = Honey,
    rating = Honey,
    glass = White,
    glassStrong = White,
    glassBorder = Color.Transparent,        // light cards use a shadow, not a border
    glow = Color.Transparent,
    glowBorder = Color.Transparent,
    overlayChip = Color(0x1A000000),        // Black @10%
)