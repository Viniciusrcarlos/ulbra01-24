package com.example.appprodutostde.src.core.extensions

import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.configureToolbar(title: String, enableBackButton: Boolean) {
    supportActionBar?.apply {
        this.title = title
        setDisplayUseLogoEnabled(enableBackButton)
    }
}