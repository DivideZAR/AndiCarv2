# AndiCar - Local Development

## Development Environment Setup

### Required Tools
- Android SDK (API level 27, 33 recommended)
- JDK 11 (for CI) / JDK 21 (for local development)

### Local Configuration

1. Create `local.properties` in the project root:
```bash
# If Android SDK is installed elsewhere, update this path
echo "sdk.dir=/path/to/android-sdk" > local.properties
```

2. For Android SDK, you can download from:
   - https://developer.android.com/studio
   - Or use command-line tools: https://developer.android.com/studio/command-line

### Build Commands
```bash
./gradlew assembleDebug  # Debug build
./gradlew assembleRelease # Release build
./gradlew lint           # Lint analysis
```

### CI Notes
- GitHub Actions workflow automatically sets up Android SDK
- Local builds require manual SDK setup