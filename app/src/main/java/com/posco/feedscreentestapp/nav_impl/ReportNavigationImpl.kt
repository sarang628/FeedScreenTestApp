package com.posco.feedscreentestapp.nav_impl

import android.content.Context
import android.widget.Toast
import com.example.torang_core.navigation.ReportNavigation
import javax.inject.Inject

class ReportNavigationImpl @Inject constructor() : ReportNavigation {
    override fun goReport(context: Context, reviewId: Int) {
        Toast.makeText(context, "goReport ${reviewId}", Toast.LENGTH_SHORT).show()
    }
}