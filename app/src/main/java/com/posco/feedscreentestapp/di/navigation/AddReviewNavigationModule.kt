package com.posco.feedscreentestapp.di.navigation

import com.example.torang_core.navigation.AddReviewNavigation
import com.posco.feedscreentestapp.nav_impl.MyReviewNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class AddReviewNavigationModule {
    @Binds
    abstract fun provideAddReviewNavigation(myReviewNavigation: MyReviewNavigation): AddReviewNavigation
}