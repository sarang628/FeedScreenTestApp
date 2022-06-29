package com.posco.feedscreentestapp.nav_impl

import android.content.Context
import android.widget.Toast
import com.example.torang_core.navigation.AddReviewNavigation
import javax.inject.Inject

class MyReviewNavigation @Inject constructor() : AddReviewNavigation {
    override fun go(context: Context, restaurantId: Int?, reviewId: Int) {
        Toast.makeText(
            context,
            "MyReviewNavigation restaurantId=${restaurantId} reviewId=${reviewId}",
            Toast.LENGTH_SHORT
        ).show()
    }
}