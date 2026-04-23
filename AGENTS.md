# AndiCar Repository - Agent Instructions

## Repository
- **Fork**: https://github.com/DivideZAR/AndiCarv2.git
- **Local Path**: /home/divide/Andicar_project/AndiCar
- **Default Branch**: master

## Modernization Complete!

### All Phases Summary

| Phase | Status | PR |
|-------|--------|-----|
| Phase 0 - Toolchain | ✅ | #1 |
| Phase 1 - Navigation | ✅ | #2 |
| Phase 2 - Compose UI | ✅ | #3 |
| Phase 3 - Tests | ✅ | #4 |
| Phase 4 - Feature Flags | ✅ | #5 |
| Phase 5 - CI/CD | ✅ | #6 |

## Key Achievements
- Gradle 8.5 + AGP 7.4.2 (Java 21 compatible)
- AndroidX + Jetifier enabled
- Navigation Component with NavHost
- Compose UI for Preferences/About screens
- Test infrastructure (JUnit, Espresso)
- FeatureFlagManager for runtime feature toggles
- Dependency groups by purpose
- GitHub Actions workflow
- DEVELOPMENT.md for local setup

## Build Commands
- `./gradlew assembleDebug` — Build debug APK
- `./gradlew lint` — Run lint analysis
- `./gradlew test` — Run unit tests

## Git Best Practices
See [CONTRIBUTING.md](./CONTRIBUTING.md) for full guidelines.

## Notes
- Full CI verification requires Android SDK environment
- DEVELOPMENT.md contains local setup instructions