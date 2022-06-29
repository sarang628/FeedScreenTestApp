package com.posco.feedscreentestapp.di.navigation

import com.example.torang_core.navigation.PicturePageNavigation
import com.posco.feedscreentestapp.nav_impl.PicturePageNavigationImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class PicturePageNavigationModule {
    @Binds
    abstract fun providePicturePageNavigation(picturePageNavigationimpl: PicturePageNavigationImpl): PicturePageNavigation

}