package com.posco.feedscreentestapp.di.navigation

import android.content.Context
import android.widget.Toast
import com.example.torang_core.navigation.ShareBottomSheetNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

class ShareBottomSheetNavigationImpl @Inject constructor() : ShareBottomSheetNavigation {
    override fun show(context: Context) {
        Toast.makeText(context, "ShareBottomSheetNavigation", Toast.LENGTH_SHORT).show()
    }
}