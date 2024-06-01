package com.example.appprodutostde

import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.configureToolbar(title: String, enableBackButton: Boolean) {
    supportActionBar?.apply {
        this.title = title
        setDisplayUseLogoEnabled(enableBackButton)
    }
}