package com.posco.feedscreentestapp.nav_impl

import android.content.Context
import android.widget.Toast
import com.example.torang_core.navigation.ProfileNavigation
import javax.inject.Inject

class ProfileNavigationImpl @Inject constructor() : ProfileNavigation {
    override fun go(context: Context, userId: Int) {
        Toast.makeText(context, "ProfileNavigation userId:${userId}", Toast.LENGTH_SHORT).show()
    }
}