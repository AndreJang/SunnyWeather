package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")//忽略编译器的警告
        lateinit var context: Context
        const val TOKEN = "ezmbhzNyTF9vnFhO"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}