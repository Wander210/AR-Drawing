package com.gdd.ar_drawing.presentation.screen.home

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.gdd.ar_drawing.R
import com.gdd.ar_drawing.base.BaseFragment
import com.gdd.ar_drawing.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCamera.setOnClickListener {
            navigateTo(R.id.cameraFragment)
        }

        binding.btnLibrary.setOnClickListener {
            navigateTo(R.id.libraryFragment)

        }

        binding.ivRecent1.setOnClickListener {
            navigateTo(R.id.drawingTypeSheet)
        }

        binding.ivCategory1.setOnClickListener {
            navigateTo(R.id.galleryFragment)
        }
    }
}