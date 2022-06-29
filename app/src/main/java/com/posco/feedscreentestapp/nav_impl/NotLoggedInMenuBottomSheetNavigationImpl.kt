package com.posco.feedscreentestapp.nav_impl

import android.content.Context
import android.widget.Toast
import com.example.torang_core.data.model.Feed
import com.example.torang_core.dialog.NotLoggedInFeedDialogEventAdapter
import com.example.torang_core.navigation.NotLoggedInMenuBottomSheetNavigation
import com.google.android.material.bottomsheet.BottomSheetDialog
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

class NotLoggedInMenuBottomSheetNavigationImpl @Inject constructor() :
    NotLoggedInMenuBottomSheetNavigation {

    var dialog: BottomSheetDialog? = null

    override fun show(
        context: Context,
        myDialogEventAdapter: NotLoggedInFeedDialogEventAdapter,
        feed: Feed
    ) {
        Toast.makeText(context, "NotLoggedInMenuBottomSheetNavigationImpl:${feed.review_id}", Toast.LENGTH_SHORT).show()
    }

    override fun dismiss() {
        dialog?.dismiss()
    }
}