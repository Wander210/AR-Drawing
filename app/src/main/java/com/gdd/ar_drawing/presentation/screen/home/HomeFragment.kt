package com.gdd.ar_drawing.presentation.screen.home

import com.gdd.ar_drawing.R
import com.gdd.ar_drawing.base.BaseFragment
import com.gdd.ar_drawing.databinding.FragmentHomeBinding
import com.gdd.ar_drawing.epoxy.controller.RecentListController
import com.gdd.ar_drawing.utils.DataUtil

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private lateinit var controller: RecentListController

    override fun initData() {
        controller = RecentListController { imageClicked ->
            navigateTo(R.id.drawingTypeSheet)
        }
        controller.listImage = DataUtil.getRecentList()
    }

    override fun setUpView() {
        binding.recentListRecyclerView.setControllerAndBuildModels(controller)
    }

    override fun setUpListener() {
        binding.btnCamera.setOnClickListener {
            navigateTo(R.id.cameraFragment)
        }

        binding.btnLibrary.setOnClickListener {
            navigateTo(R.id.libraryFragment)

        }

        binding.ivCategory1.setOnClickListener {
            navigateTo(R.id.galleryFragment)
        }
    }
}