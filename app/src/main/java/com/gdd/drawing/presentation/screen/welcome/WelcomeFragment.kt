package com.gdd.drawing.presentation.screen.welcome

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.gdd.drawing.base.BaseFragment
import com.gdd.drawing.databinding.FragmentWelcomeBinding
import com.gdd.drawing.presentation.screen.splash.SplashFragmentDirections

class WelcomeFragment : BaseFragment<FragmentWelcomeBinding>(FragmentWelcomeBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnHome.setOnClickListener {
            it.findNavController().navigate(
                WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
            )
        }

        binding.btnExplore.setOnClickListener {
            it.findNavController().navigate(
                WelcomeFragmentDirections.actionWelcomeFragmentToGalleryFragment()
            )
        }
    }
}