package com.posco.feedscreentestapp.di.navigation

import android.content.Context
import com.example.torang_core.data.model.Feed
import com.example.torang_core.dialog.FeedDialogEventAdapter
import com.example.torang_core.navigation.MenuBottomSheetNavigation
import com.example.torang_core.navigation.MyMenuBottomSheetNavigation
import com.example.torang_core.navigation.NotLoggedInMenuBottomSheetNavigation
import com.example.torang_core.navigation.ReportNavigation
import com.example.torang_core.util.Logger
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@Module
@InstallIn(ActivityComponent::class)
abstract class FeedDialogEventAdapterModule {
    @Binds
    abstract fun provideFeedDialogEventAdapter(feedDialogEventAdapter: FeedDialogEventAdapterImpl): FeedDialogEventAdapter

}

class FeedDialogEventAdapterImpl @Inject constructor(
    @ApplicationContext private val context: Context,
    private val reportNavigation: ReportNavigation
) : FeedDialogEventAdapter {
    override fun reasonContainThisPost(reviewId: Int) {

    }

    override fun hide(feed: Feed) {

    }

    override fun unfollow(feed: Feed) {

    }

    override fun report1(reviewId: Int) {
        reportNavigation.goReport(context, reviewId)
    }

}