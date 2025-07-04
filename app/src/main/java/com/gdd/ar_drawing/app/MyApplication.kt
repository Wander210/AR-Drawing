package com.gdd.ar_drawing.app

import android.app.Application
import com.gdd.ar_drawing.preference.MyPreferences

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MyPreferences.init(this)
    }
}