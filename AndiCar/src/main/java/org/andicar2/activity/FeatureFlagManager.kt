package org.andicar2.activity

import android.content.Context
import android.content.SharedPreferences

/**
 * Manages runtime feature flags for Compose screens.
 * Uses SharedPreferences for dynamic enable/disable without rebuild.
 */
object FeatureFlagManager {

    private const val PREFS_NAME = "feature_flags"
    private const val KEY_COMPOSE_ENABLED = "feature_compose_enabled"

    /**
     * Get SharedPreferences instance for flag management.
     */
    private fun getPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    /**
     * Check if Compose feature is enabled.
     * Runtime override takes precedence over BuildConfig default.
     */
    fun isComposeEnabled(context: Context): Boolean {
        val prefs = getPreferences(context)
        return prefs.getBoolean(KEY_COMPOSE_ENABLED, getDefaultComposeEnabled())
    }

    /**
     * Set Compose feature enabled state.
     * Runtime override persists across sessions.
     */
    fun setComposeEnabled(context: Context, enabled: Boolean) {
        val prefs = getPreferences(context)
        prefs.edit().putBoolean(KEY_COMPOSE_ENABLED, enabled).apply()
    }

    /**
     * Get default Compose enabled state from BuildConfig.
     */
    private fun getDefaultComposeEnabled(): Boolean {
        return true // Default to enabled
    }

    /**
     * Toggle Compose feature state.
     * Convenience method for switching on/off.
     */
    fun toggleComposeEnabled(context: Context) {
        val currentState = isComposeEnabled(context)
        setComposeEnabled(context, !currentState)
    }

    /**
     * Reset Compose feature to default state (BuildConfig).
     */
    fun resetComposeEnabled(context: Context) {
        val prefs = getPreferences(context)
        prefs.edit().remove(KEY_COMPOSE_ENABLED).apply()
    }
}