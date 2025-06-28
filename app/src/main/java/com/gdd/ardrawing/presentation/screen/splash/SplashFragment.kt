package com.gdd.ardrawing.presentation.screen.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import androidx.navigation.fragment.findNavController
import com.gdd.ardrawing.base.BaseFragment
import com.gdd.ardrawing.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.e("SplashFragment", "onViewCreated called")
        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(
                SplashFragmentDirections.actionSplashFragmentToWelcomeFragment()
            )
        }, 3000)
    }
}