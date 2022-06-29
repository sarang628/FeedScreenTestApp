package com.posco.feedscreentestapp.di.navigation

import com.example.torang_core.navigation.ReportNavigation
import com.posco.feedscreentestapp.nav_impl.ReportNavigationImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class ReportNavigationModule {
    @Binds
    abstract fun provideReportNavigation(reportNavigationImpl: ReportNavigationImpl): ReportNavigation
}