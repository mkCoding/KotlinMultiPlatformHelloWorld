package com.example.kmphelloworldproj

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform