# Endana (عندنا) — Hyper-Local Delivery App

An Android app that connects local vendors (restaurants, supermarkets, pharmacies, shops) with customers in neighboring towns, starting with the **Zefta & Mit Ghamr** hubs in Egypt. Vendors publish daily deals, customers browse by sector, and orders are sent through a structured **WhatsApp checkout** with delivery-fee rules.

> **Status: MVP in active development.**


## Features

| Feature | Status |
| --- | --- |
| Home screen: location card, flash-deal banner, sector grid, store feed | Done (sample data) |
| Light and dark Material 3 theme built from the Figma design | Done |
| Bottom navigation (Hub, Search, Orders, Profile) | Done (UI) |
| Arabic / English switch (RTL-aware icons and layout) | In progress |
| Firestore-backed deals and store catalog | Planned |
| Smart cart with delivery-fee aggregation (fixed, area-based, free-shipping threshold) | Planned |
| WhatsApp checkout with a formatted order message | Planned |
| Location-based browsing across towns | Planned |

## Tech stack

- **Language:** Kotlin
- **UI:** Jetpack Compose, Material 3, Navigation Compose
- **Architecture:** MVVM + Clean Architecture (target structure, see below)
- **Async:** Kotlin Coroutines and StateFlow
- **DI:** Dagger-Hilt
- **Local storage:** Room
- **Backend (planned):** Firebase Firestore and Storage
- **Images (planned):** Coil
- **Build:** AGP 9.4, Kotlin 2.4, KSP 2.3, Gradle version catalog, minSdk 26 / targetSdk 37

## Architecture

```
presentation/   Compose screens, components, ViewModels, theme
domain/         Use cases and models (pure Kotlin)        — planned
data/           Repositories, Firestore and Room sources  — planned
```

UI is built as small, stateless composables (for example `FlashDealBanner`, `SectorTile`, `StoreCard`, `AndanaBottomBar`) that take their data and callbacks as parameters, and read all colors from the theme so light and dark mode work without per-screen code.

## Design

The UI follows a Figma design ("Andana App Store"). Colors, spacing and typography were translated into a central `Color.kt` and `Theme.kt`, with the brand green as `primary`, blue as `secondary` and amber as `tertiary`.

## Getting started

1. Clone the repository and open it in a recent Android Studio (AGP 9.4 requires Gradle 9.1+).
2. Let Gradle sync, then run the `app` configuration on an emulator or device (API 26+).
3. When the Firebase backend is connected, add your own `google-services.json` to `app/`. It is not committed.

## Roadmap

1. **Phase 1 (current MVP):** customer app, WhatsApp checkout, cloud backend
2. **Phase 2:** merchant app and admin web dashboard for order management
3. **Phase 3:** driver app with real-time GPS tracking and route optimization
4. **Phase 4:** iOS via Kotlin Multiplatform

## Author

Mahmoud kariem -mahmoud.kariem.dev@gmail.com -https://www.linkedin.com/in/mahmoud-kariem/
