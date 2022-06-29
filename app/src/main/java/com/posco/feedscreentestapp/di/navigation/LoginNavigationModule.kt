package com.posco.feedscreentestapp.di.navigation

import com.example.torang_core.navigation.LoginNavigation
import com.posco.feedscreentestapp.nav_impl.LoginNavigationImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class LoginNavigationModule {
    @Binds
    abstract fun provideLoginNavigation(loginNavigationImpl: LoginNavigationImpl): LoginNavigation
}