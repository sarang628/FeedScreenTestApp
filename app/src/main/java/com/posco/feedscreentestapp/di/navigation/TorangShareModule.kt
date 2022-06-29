package com.posco.feedscreentestapp.di.navigation

import com.example.torang_core.navigation.TorangShare
import com.posco.feedscreentestapp.nav_impl.TorangShareImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class TorangShareModule {
    @Binds
    abstract fun provideTorangShare(torangShareImpl: TorangShareImpl): TorangShare
}