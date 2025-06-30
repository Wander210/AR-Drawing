package com.gdd.ar_drawing.extention

import androidx.fragment.app.Fragment

//Extension function
fun Fragment.checkIfFragmentAttached(operation: () -> Unit) {
    if (isAdded && context != null) {
        operation()
    }
}