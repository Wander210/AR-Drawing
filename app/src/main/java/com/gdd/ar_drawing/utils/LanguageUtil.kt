package com.gdd.ar_drawing.utils

import android.content.Context
import com.gdd.ar_drawing.preference.MyPreferences
import java.util.Locale
import javax.inject.Inject

class LanguageUtil @Inject constructor(private val myPreferences: MyPreferences) {
    fun setLanguage(context: Context?) {
        if (context == null) return
        var language: String? = myPreferences.read(MyPreferences.PREF_LANGUAGE, null)
        if (language == null) {
            language = Locale.getDefault().language
        }
        val newLocale = Locale(language!!.lowercase(Locale.getDefault()))
        Locale.setDefault(newLocale)
        val res = context.resources
        val conf = res.configuration
        conf.setLocale(newLocale)
        res.updateConfiguration(conf, res.displayMetrics)
    }
}