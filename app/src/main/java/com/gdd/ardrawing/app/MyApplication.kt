package com.gdd.ardrawing.app

import android.app.Application
import com.gdd.ardrawing.preference.MyPreferences

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MyPreferences.init(this)
    }
}