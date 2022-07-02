package com.posco.feedscreentestapp.nav_impl

import android.content.Context
import android.widget.Toast
import com.example.torang_core.data.model.Feed
import com.example.torang_core.dialog.FeedDialogEventAdapter
import com.example.torang_core.dialog.NotLoggedInFeedDialogEventAdapter
import com.example.torang_core.navigation.MenuBottomSheetNavigation
import com.google.android.material.bottomsheet.BottomSheetDialog
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class MenuBottomSheetNavigationImpl @Inject constructor(
    @ApplicationContext val context: Context
) : MenuBottomSheetNavigation {

    var dialog: BottomSheetDialog? = null

    override fun show(feed: Feed) {
        Toast.makeText(context, "${feed.review_id}", Toast.LENGTH_SHORT).show()
    }

    override fun dismiss() {
        dialog?.dismiss()
    }
}