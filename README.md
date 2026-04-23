# AndiCar - Free Trip log & Expense tracker for Android devices

AndiCar is a free vehicle management, trip log, and expense tracker for Android devices.

It can be installed from Google Play: [ https://play.google.com/store/apps/details?id=org.andicar2.activity](https://play.google.com/store/apps/details?id=org.andicar2.activity)

## CI Verification
<!-- Trigger CI build -->

## Feature Flags

AndiCar uses a runtime feature flag system to enable/disable new features without rebuilding the app.

### Compose Feature Flag

- **Default:** Enabled (Compose screens shown)
- **Setting Location:** SharedPreferences (`feature_flags` file)
- **Key:** `feature_compose_enabled`

#### Usage

```kotlin
// Check if Compose is enabled
val isEnabled = FeatureFlagManager.isComposeEnabled(context)

// Enable Compose feature
FeatureFlagManager.setComposeEnabled(context, true)

// Disable Compose feature
FeatureFlagManager.setComposeEnabled(context, false)

// Toggle between enabled/disabled
FeatureFlagManager.toggleComposeEnabled(context)

// Reset to default (enabled)
FeatureFlagManager.resetComposeEnabled(context)
```

## License:
GNU General Public License 3+
