package com.gdd.ar_drawing.presentation.dialog

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.gdd.ar_drawing.R
import com.gdd.ar_drawing.base.BaseDialogFragment
import com.gdd.ar_drawing.databinding.FragmentDrawingTypeSheetBinding

class DrawingTypeSheet : BaseDialogFragment<FragmentDrawingTypeSheetBinding>(
    FragmentDrawingTypeSheetBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSketching.setOnClickListener {
            navigateTo(R.id.sketchingFragment)
            dismiss()  // Close the dialog after navigating
        }
        binding.btnTracing.setOnClickListener {
            navigateTo(R.id.tracingFragment)
            dismiss()
        }
    }
}