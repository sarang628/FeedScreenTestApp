package com.posco.feedscreentestapp.nav_impl

import android.content.Context
import android.widget.Toast
import com.example.torang_core.navigation.ShareBottomSheetNavigation
import javax.inject.Inject

class TestShareBottomSheetNavigation @Inject constructor() : ShareBottomSheetNavigation {
    override fun show(context: Context) {
        Toast.makeText(context, "shareBottomSheetNavigation", Toast.LENGTH_SHORT).show()
    }
}