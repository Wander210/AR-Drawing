package com.gdd.ardrawing.presentation.dialog

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.gdd.ardrawing.base.BaseDialogFragment
import com.gdd.ardrawing.databinding.FragmentDrawingTypeSheetBinding

class DrawingTypeSheet : BaseDialogFragment<FragmentDrawingTypeSheetBinding>(
    FragmentDrawingTypeSheetBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        binding.btnSketching.setOnClickListener {
            navController.navigate(
                DrawingTypeSheetDirections.actionDrawingTypeSheetToSketchingFragment()
            )
            dismiss()  // đóng dialog sau khi navigate
        }
        binding.btnTracing.setOnClickListener {
            navController.navigate(
                DrawingTypeSheetDirections.actionDrawingTypeSheetToTracingFragment()
            )
            dismiss()
        }
    }
}