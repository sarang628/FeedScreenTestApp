package com.posco.feedscreentestapp.di.navigation

import com.example.torang_core.navigation.MenuBottomSheetNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class MenuBottomSheetNavigationModule {
    @Binds
    abstract fun go(
//        menuBottomSheetNavigationImpl: com.posco.feedscreentestapp.nav_impl.MenuBottomSheetNavigationImpl
        menuBottomSheetNavigationImpl: com.example.bagle_bottom_sheet_dialog.MenuBottomSheetNavigationImpl
    ): MenuBottomSheetNavigation
}