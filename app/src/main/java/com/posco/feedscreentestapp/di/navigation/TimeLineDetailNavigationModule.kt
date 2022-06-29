package com.posco.feedscreentestapp.di.navigation

import com.example.torang_core.navigation.TimeLineDetailNavigation
import com.posco.feedscreentestapp.nav_impl.TimeLineDetailNavigationImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class TimeLineDetailNavigationModule {
    @Binds
    abstract fun bindTimeLineDetailNavigation(
        timeLineNavigationImpl: TimeLineDetailNavigationImpl
    ): TimeLineDetailNavigation
}