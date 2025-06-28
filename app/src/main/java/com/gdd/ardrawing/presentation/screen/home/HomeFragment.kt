package com.gdd.ardrawing.presentation.screen.home

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.gdd.ardrawing.base.BaseFragment
import com.gdd.ardrawing.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCamera.setOnClickListener {
            it.findNavController().navigate(
                HomeFragmentDirections.actionHomeFragmentToCameraFragment()
            )
        }

        binding.btnLibrary.setOnClickListener {
            it.findNavController().navigate(
                HomeFragmentDirections.actionHomeFragmentToLibraryFragment()
            )
        }

        binding.ivRecent1.setOnClickListener {
            it.findNavController().navigate(
                HomeFragmentDirections.actionHomeFragmentToDrawingTypeSheet()
            )
        }

        binding.ivCategory1.setOnClickListener {
            it.findNavController().navigate(
                HomeFragmentDirections.actionHomeFragmentToGalleryFragment()
            )
        }
    }
}