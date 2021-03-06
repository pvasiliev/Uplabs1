package com.pvasiliev.uplabs

import android.app.Application
import android.support.text.emoji.EmojiCompat
import android.support.text.emoji.bundled.BundledEmojiCompatConfig
import com.pvasiliev.uplabs.di.AppModule
import toothpick.Toothpick

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        val scope = Toothpick.openScope(this)
        scope.installModules(AppModule())
        val config = BundledEmojiCompatConfig(this)
        EmojiCompat.init(config)
    }
}