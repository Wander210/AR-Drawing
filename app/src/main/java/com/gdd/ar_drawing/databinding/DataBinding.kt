package com.gdd.ar_drawing.databinding

import android.net.Uri
import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("bind:imageUrl", "bind:isSelected")
fun loadImage(view: ImageView, url: String?, isSelected: Boolean) {
    Log.e("BIND_TEST", "URI = $url isSel=$isSelected")
    Glide.with(view.context)
        .load(if (!isSelected) Uri.parse("file:///android_asset/" + url)
            else Uri.parse("file:///android_asset/av/arisu_nanase.webp"))
        .error(Uri.parse("file:///android_asset/av/arisu_nanase.webp")).into(view)
}