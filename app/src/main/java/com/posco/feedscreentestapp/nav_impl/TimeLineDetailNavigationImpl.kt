package com.posco.feedscreentestapp.nav_impl

import android.content.Context
import android.widget.Toast
import com.example.torang_core.navigation.TimeLineDetailNavigation
import javax.inject.Inject

class TimeLineDetailNavigationImpl @Inject constructor() : TimeLineDetailNavigation {
    override fun go(context: Context, userId: Int) {
        Toast.makeText(context, "TimeLineDetailNavigation userId:${userId}", Toast.LENGTH_SHORT)
            .show()
    }
}