package com.posco.feedscreentestapp.di.navigation

import com.example.torang_core.navigation.NotLoggedInMenuBottomSheetNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class NotLoggedInMenuBottomSheetNavigationModule {
    @Binds
    abstract fun go(
//        menuBottomSheetNavigationImpl: com.posco.feedscreentestapp.nav_impl.NotLoggedInMenuBottomSheetNavigationImpl
        menuBottomSheetNavigationImpl: com.example.bagle_bottom_sheet_dialog.NotLoggedInMenuBottomSheetNavigationImpl
    ): NotLoggedInMenuBottomSheetNavigation
}