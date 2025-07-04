package com.gdd.ar_drawing.utils

import com.gdd.ar_drawing.model.Image

object DataUtil {
    fun getRecentList(): LinkedHashSet<Image> {
        return linkedSetOf(
            Image(0, "av/arisu_nanase.webp", false),
            Image(1, "av/rei_kamiki.webp", false),
            Image(2, "av/suzu_honjo.webp", false),
            Image(3, "av/waka_misono.webp", false),
        )
    }
}