package com.posco.feedscreentestapp.di.navigation

import com.example.torang_core.navigation.ProfileNavigation
import com.posco.feedscreentestapp.nav_impl.ProfileNavigationImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class ProfileNavigationModule {
    @Binds
    abstract fun bindProfileNavigation(
        profileNavigationImpl: ProfileNavigationImpl
    ): ProfileNavigation
}