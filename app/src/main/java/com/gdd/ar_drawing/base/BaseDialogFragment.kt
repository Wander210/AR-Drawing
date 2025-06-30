package com.gdd.ar_drawing.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.gdd.ar_drawing.R
import com.gdd.ar_drawing.extention.checkIfFragmentAttached
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

abstract class BaseDialogFragment<BINDING : ViewBinding>(private val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> BINDING) : BottomSheetDialogFragment() {

    lateinit var binding: BINDING

    protected val navController: NavController
        get() = when {
            // Nếu dialog nằm trong một Fragment khác
            parentFragment != null -> requireParentFragment().findNavController()
            // Nếu dialog được show trực tiếp từ Activity
            else -> requireActivity().findNavController(R.id.nav_host_fragment)
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = bindingInflater(inflater, container, false)
        return binding.root
    }

    protected fun navigateTo(
        id: Int,
        inclusive: Boolean = false,
    ) {
        checkIfFragmentAttached {
            navController.navigate(
                id,
                null,
                buildNavOptions(inclusive)
            )
        }
    }

    private fun buildNavOptions(inclusive: Boolean): NavOptions {
        return NavOptions.Builder().apply {
            val currentDestination = findNavController().currentDestination?.id
            if (inclusive && currentDestination != null) {
                setPopUpTo(currentDestination, true)
            }
            setEnterAnim(R.anim.no_animation)
            setExitAnim(R.anim.no_animation)
            setPopEnterAnim(R.anim.no_animation)
            setPopExitAnim(R.anim.slide_out_right)
        }.build()
    }
}