package com.gdd.ardrawing.presentation.screen.welcome

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.gdd.ardrawing.base.BaseFragment
import com.gdd.ardrawing.databinding.FragmentWelcomeBinding

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