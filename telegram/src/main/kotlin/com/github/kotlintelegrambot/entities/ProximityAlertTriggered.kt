package com.github.kotlintelegrambot.entities

data class ProximityAlertTriggered(
    val traveler: User = User(),
    val watcher: User = User(),
    val distance: Int = 0,
)
