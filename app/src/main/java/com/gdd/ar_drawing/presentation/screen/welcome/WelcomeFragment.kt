package com.gdd.ar_drawing.presentation.screen.welcome

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.gdd.ar_drawing.R
import com.gdd.ar_drawing.base.BaseFragment
import com.gdd.ar_drawing.databinding.FragmentWelcomeBinding

class WelcomeFragment : BaseFragment<FragmentWelcomeBinding>(FragmentWelcomeBinding::inflate) {
    override fun initData() {
    }

    override fun setUpView() {
    }

    override fun setUpListener() {
        binding.btnHome.setOnClickListener {
            navigateTo(R.id.homeFragment)
        }

        binding.btnExplore.setOnClickListener {
            navigateTo(R.id.galleryFragment)
        }    }
}