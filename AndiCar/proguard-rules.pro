# AndiCar ProGuard Rules
# ProGuard rules for release builds

# Keep Firebase classes (Crashlytics, Analytics, Messaging)
-keep class com.google.firebase.** { *; }
-keepclassmembers class com.google.firebase.** { *; }
-keep class com.google.firebase.crashlytics.** { *; }

# Keep Google API Client classes
-keep class com.google.api.** { *; }
-keep class com.google.apis.** { *; }

# Keep Gmail API service classes
-keep class com.google.api.services.gmail.** { *; }

# Keep Jakarta Mail classes
-keep class com.sun.mail.** { *; }
-keep class jakarta.mail.** { *; }
-keep class javax.mail.** { *; }

# Keep AndroidX Compose classes
-keep class androidx.compose.** { *; }

# Keep legacy support library (for backward compatibility)
-keep class android.support.** { *; }
-keep class com.android.support.** { *; }

# Remove obfuscation - ENABLE for production
# (removed -dontobfuscate to enable obfuscation)

# Keep Data classes
-keep class andicar.n.data.** { *; }

# Keep model classes
-keep class org.andicar2.activity.** { *; }

# Preserve line numbers for crash reports
-keepattributes SourceFile,LineNumberTable

# Keep signature for reflection
-keepattributes Signature

# Keep exceptions
-keepattributes Exception