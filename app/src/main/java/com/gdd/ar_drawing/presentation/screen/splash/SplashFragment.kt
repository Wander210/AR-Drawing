package com.gdd.ar_drawing.presentation.screen.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import androidx.navigation.fragment.findNavController
import com.gdd.ar_drawing.R
import com.gdd.ar_drawing.base.BaseFragment
import com.gdd.ar_drawing.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.e("SplashFragment", "onViewCreated called")
        Handler(Looper.getMainLooper()).postDelayed({
            navigateTo(R.id.welcomeFragment)
        }, 3000)
    }
}