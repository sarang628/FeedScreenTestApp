package com.posco.feedscreentestapp.di.navigation

import com.example.torang_core.navigation.ShareBottomSheetNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class ShareBottomSheetNavigationModule {
    @Binds
    abstract fun go(
        shareBottomSheetNavigationImpl: ShareBottomSheetNavigationImpl
    ): ShareBottomSheetNavigation
}