package com.posco.feedscreentestapp.nav_impl

import android.content.Context
import android.widget.Toast
import com.example.torang_core.data.model.Feed
import com.example.torang_core.dialog.FeedMyDialogEventAdapter
import com.example.torang_core.navigation.MyMenuBottomSheetNavigation
import com.google.android.material.bottomsheet.BottomSheetDialog
import javax.inject.Inject

class MyMenuBottomSheetNavigationImpl @Inject constructor() : MyMenuBottomSheetNavigation {

    var dialog: BottomSheetDialog? = null

    override fun show(
        context: Context,
        myDialogEventAdapter: FeedMyDialogEventAdapter,
        feed: Feed
    ) {
        Toast.makeText(
            context,
            "MyMenuBottomSheetNavigationImpl: ${feed.review_id}",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun dismiss() {
        dialog?.dismiss()
    }
}