package com.posco.feedscreentestapp.di.navigation

import com.example.torang_core.navigation.RestaurantDetailNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class RestaurantNavigationModule {
    @Binds
    abstract fun bindTimeLineDetailNavigation(
        restaurantDetailNavigationImpl: RestaurantDetailNavigationModule
    ): RestaurantDetailNavigation
}

