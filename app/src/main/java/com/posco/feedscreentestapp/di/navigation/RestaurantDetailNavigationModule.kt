package com.posco.feedscreentestapp.di.navigation

import android.content.Context
import android.widget.Toast
import com.example.torang_core.navigation.RestaurantDetailNavigation
import javax.inject.Inject

class RestaurantDetailNavigationModule @Inject constructor() : RestaurantDetailNavigation {
    override fun go(context: Context, restaurantId: Int) {
        Toast.makeText(context, "restaurantid = $restaurantId", Toast.LENGTH_SHORT).show()
    }
}