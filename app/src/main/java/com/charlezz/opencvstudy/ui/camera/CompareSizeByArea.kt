package com.charlezz.opencvstudy.ui.camera

import android.util.Size
import java.lang.Long
import java.util.*

class CompareSizesByArea : Comparator<Size> {

    // We cast here to ensure the multiplications won't overflow
    override fun compare(lhs: Size, rhs: Size) =
        Long.signum(lhs.width.toLong() * lhs.height - rhs.width.toLong() * rhs.height)

}