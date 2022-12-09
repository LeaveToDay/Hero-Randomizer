package com.staynight.lab7herorandomizer.data.models

data class Hero(
    val appearance: Appearance? = null,
    val biography: Biography? = null,
    val connections: Connections? = null,
    val id: Int? = null,
    val images: Images? = null,
    val name: String? = null,
    val powerstats: Powerstats? = null,
    val slug: String? = null,
    val work: Work? = null
)