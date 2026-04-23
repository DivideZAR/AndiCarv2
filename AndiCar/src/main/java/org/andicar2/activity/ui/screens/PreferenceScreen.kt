package org.andicar2.activity.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class PreferenceCategory(
    val title: String,
    val items: List<PreferenceItem>
)

data class PreferenceItem(
    val title: String,
    val summary: String = ""
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PreferenceScreen(
    onNavigateBack: () -> Unit = {}
) {
    val categories = remember {
        listOf(
            PreferenceCategory(
                title = "Cars & Drivers",
                items = listOf(
                    PreferenceItem("Cars", "Manage your vehicles"),
                    PreferenceItem("Drivers", "Manage drivers")
                )
            ),
            PreferenceCategory(
                title = "Expenses",
                items = listOf(
                    PreferenceItem("Expense Categories", "Categories for expenses"),
                    PreferenceItem("Expense Types", "Types of expenses"),
                    PreferenceItem("Currencies", "Manage currencies"),
                    PreferenceItem("Currency Rates", "Exchange rates")
                )
            ),
            PreferenceCategory(
                title = "GPS Tracking",
                items = listOf(
                    PreferenceItem("GPS Preferences", "GPS tracking settings")
                )
            ),
            PreferenceCategory(
                title = "Data",
                items = listOf(
                    PreferenceItem("Backup / Restore", "Backup or restore database"),
                    PreferenceItem(" Measurement Units", "UOM and conversions")
                )
            ),
            PreferenceCategory(
                title = "Partners & Tags",
                items = listOf(
                    PreferenceItem("Partners", "Business partners"),
                    PreferenceItem("Tags", "Manage tags")
                )
            ),
            PreferenceCategory(
                title = "Tasks",
                items = listOf(
                    PreferenceItem("Task Types", "Types of tasks"),
                    PreferenceItem("Tasks", "Scheduled tasks")
                )
            )
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Preferences") },
                navigationIcon = {
                    TextButton(onClick = onNavigateBack) {
                        Text("Back")
                    }
                }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 16.dp)
        ) {
            items(categories) { category ->
                Text(
                    text = category.title,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                )
                category.items.forEach { item ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Text(
                                text = item.title,
                                style = MaterialTheme.typography.bodyLarge
                            )
                            if (item.summary.isNotEmpty()) {
                                Text(
                                    text = item.summary,
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}