package com.posco.feedscreentestapp.nav_impl

import android.content.Context
import android.widget.Toast
import com.example.torang_core.navigation.PicturePageNavigation
import javax.inject.Inject

class PicturePageNavigationImpl @Inject constructor() : PicturePageNavigation {
    override fun go(context: Context, reviewId: Int, position: Int) {
        Toast.makeText(
            context,
            "PicturePageNavigation reviewId=${reviewId}, position=${position}",
            Toast.LENGTH_SHORT
        ).show()
    }
}