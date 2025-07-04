package com.gdd.ar_drawing.presentation.screen.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gdd.ar_drawing.R
import com.gdd.ar_drawing.base.BaseFragment
import com.gdd.ar_drawing.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val am = requireContext().assets
        am.list("av")?.forEach { name ->
            val path = "av/$name"
            val uri  = "file:///android_asset/$path"
            Log.e("ASSET_TEST", "Found asset → $uri")
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun initData() {
    }

    override fun setUpView() {
        Handler(Looper.getMainLooper()).postDelayed({
            navigateTo(R.id.welcomeFragment)
        }, 3000)
    }

    override fun setUpListener() {
    }
}