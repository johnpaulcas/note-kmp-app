package com.johnpaulcas.notes

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform