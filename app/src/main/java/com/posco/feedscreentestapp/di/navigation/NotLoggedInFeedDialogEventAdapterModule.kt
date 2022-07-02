package com.posco.feedscreentestapp.di.navigation

import android.content.Context
import com.example.torang_core.data.model.Feed
import com.example.torang_core.dialog.FeedDialogEventAdapter
import com.example.torang_core.dialog.FeedMyDialogEventAdapter
import com.example.torang_core.dialog.NotLoggedInFeedDialogEventAdapter
import com.example.torang_core.navigation.*
import com.example.torang_core.util.Logger
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@Module
@InstallIn(ActivityComponent::class)
abstract class NotLoggedInFeedDialogEventAdapterModule {
    @Binds
    abstract fun provideFeedDialogEventAdapter(feedDialogEventAdapter: NotLoggedInFeedDialogEventAdapterImpl): NotLoggedInFeedDialogEventAdapter

}

class NotLoggedInFeedDialogEventAdapterImpl @Inject constructor(
    @ApplicationContext private val context: Context,
    private val menuBottomSheetNavigation: MenuBottomSheetNavigation,
    private val myMenuBottomSheetNavigation: MyMenuBottomSheetNavigation,
    private val notLoggedInMenuBottomSheetNavigation: NotLoggedInMenuBottomSheetNavigation,
    private val reportNavigation: ReportNavigation,
    private val addReviewNavigation : AddReviewNavigation
) : NotLoggedInFeedDialogEventAdapter {
    override fun report2(reviewId: Int) {
        Logger.d("observe report")
        myMenuBottomSheetNavigation.dismiss()
        menuBottomSheetNavigation.dismiss()
        notLoggedInMenuBottomSheetNavigation.dismiss()
        reportNavigation.goReport(context, reviewId)
    }
}