package com.posco.feedscreentestapp.nav_impl

import android.content.Context
import android.widget.Toast
import com.example.torang_core.data.model.Feed
import com.example.torang_core.dialog.FeedDialogEventAdapter
import com.example.torang_core.navigation.MenuBottomSheetNavigation
import com.google.android.material.bottomsheet.BottomSheetDialog
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

class MenuBottomSheetNavigationImpl @Inject constructor() : MenuBottomSheetNavigation {

    var dialog: BottomSheetDialog? = null

    override fun show(
        context: Context,
        feedDialogEventAdapter: FeedDialogEventAdapter,
        feed: Feed
    ) {
        Toast.makeText(context, "${feed.review_id}", Toast.LENGTH_SHORT).show()
    }

    override fun dismiss() {
        dialog?.dismiss()
    }

    @Module
    @InstallIn(ActivityComponent::class)
    abstract class MenuBottomSheetNavigationModule {
        @Binds
        abstract fun go(
            menuBottomSheetNavigationImpl: MenuBottomSheetNavigationImpl
        ): MenuBottomSheetNavigation
    }
}