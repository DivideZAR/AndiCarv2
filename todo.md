# AndiCar Modernization - Todo List

## Phases

- [x] Phase 0 — Toolchain (Gradle 8.5 + AGP 7.4.2) ✅ DONE
- [x] Phase 1 — Single-Activity + Navigation ✅ DONE
- [x] Phase 2 — Compose Migration ✅ DONE
- [x] Phase 3 — Tests & Quality ✅ DONE
- [x] Phase 4 — Modularization & Feature Flags ✅ DONE
- [x] Phase 5 — CI/CD Final Verification ✅ DONE
- [x] Phase 6 — Security Updates (Play Services, Firebase, Jakarta Mail) ✅ DONE
- [x] Phase 7 — Testing Infrastructure ✅ DONE
- [x] Phase 8 — Code Quality (ProGuard Enabled) ✅ DONE
- [x] Phase 8 Task 2 — Fix Lint Warnings (HandlerLeak) ✅ DONE
- [x] Phase 8 Task 2 Step 2 — Fix StaticFieldLeak ✅ DONE
- [x] Phase 8 Task 2 Step 3 — Fix ALL @SuppressLint ✅ DONE

## Current Status

- **Branch**: master (merged)
- **Last Merge**: PR #10 - Testing infrastructure
- **PRs**: Merged #1-#10

## Local Development Setup

### Option A: Windows with Android Studio (Recommended)

- [ ] Open Android Studio
- [ ] File → New → Project from Version Control
- [ ] Enter URL: `https://github.com/DivideZAR/AndiCarv2`
- [ ] Click "Clone"
- [ ] Wait for Gradle to download dependencies
- [ ] Build → Build Bundle(s) / APK(s) → Build APK(s)
- [ ] APK location: `AndiCar\AndiCar\build\outputs\apk\debug\AndiCar-debug.apk`

#### Install on Phone (USB)

- [ ] Enable USB Debugging: Settings → Developer Options → USB Debugging
- [ ] Connect phone via USB
- [ ] Click green "Run" arrow in Android Studio
- [ ] Select your phone

#### Install on Phone (Manual)

- [ ] Transfer APK to phone via USB/email/cloud
- [ ] Allow "Unknown sources" installation
- [ ] Open APK and install

### Option C: Linux (Android Studio)

- [ ] Install prerequisites:
  ```bash
  sudo apt update
  sudo apt install openjdk-11-jdk wget unzip
  ```
- [ ] Download: https://developer.android.com/studio
- [ ] Extract: `sudo mkdir -p /opt/android-studio && sudo tar -xzf android-studio-*.tar.gz -C /opt/android-studio --strip-components=1`
- [ ] Run: `/opt/android-studio/bin/studio.sh`
- [ ] Complete setup wizard (downloads SDK ~10GB)
- [ ] Clone fork: https://github.com/DivideZAR/AndiCarv2
- [ ] Build: Build → Build APK
- [ ] Install on phone via USB or transfer APK

### Option D: GitHub Codespaces (Cloud)

- [ ] Go to: https://github.com/DivideZAR/AndiCarv2
- [ ] Click "Code" → "Create codespace"
- [ ] Run: `./gradlew assembleDebug`
- [ ] Download generated APK

### USB Debugging Setup

- [ ] Enable Developer Options (tap Build Number 7 times)
- [ ] Enable USB Debugging in Settings → Developer Options
- [ ] Connect phone via USB
- [ ] Verify: `adb devices`

### Manual APK Installation

- [ ] Build APK in Android Studio: Build → Build APK
- [ ] APK location: `AndiCar/AndiCar/build/outputs/apk/debug/AndiCar-debug.apk`
- [ ] Transfer APK to phone via USB/email/cloud
- [ ] Allow "Unknown sources" installation
- [ ] Open APK and install

## Complete!