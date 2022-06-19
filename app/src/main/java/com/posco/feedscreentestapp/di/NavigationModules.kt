package com.posco.feedscreentestapp.di

import android.content.Context
import android.content.Intent
import androidx.fragment.app.FragmentManager
import com.example.torang_core.data.model.Feed
import com.example.torang_core.dialog.FeedDialogEventAdapter
import com.example.torang_core.dialog.FeedMyDialogEventAdapter
import com.example.torang_core.dialog.NotLoggedInFeedDialogEventAdapter
import com.example.torang_core.navigation.*
import com.google.android.material.bottomsheet.BottomSheetDialog
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

class NavigationModules {
}

@Module
@InstallIn(ActivityComponent::class)
abstract class RestaurantNavigationInject {
    @Binds
    abstract fun bindTimeLineDetailNavigation(
        restaurantDetailNavigationImpl: TestRestaurantDetailNavigation
    ): RestaurantDetailNavigation
}

class TestRestaurantDetailNavigation @Inject constructor() : RestaurantDetailNavigation {
    override fun go(context: Context, restaurantId: Int) {

    }
}

class TestShareBottomSheetNavigation @Inject constructor() : ShareBottomSheetNavigation {
    override fun show(context: Context) {

    }
}

class ProfileNavigationImpl @Inject constructor() : ProfileNavigation {
    override fun go(context: Context, userId: Int) {
    }
}

@Module
@InstallIn(ActivityComponent::class)
abstract class ProfileNavigationInject {
    @Binds
    abstract fun bindProfileNavigation(
        profileNavigationImpl: ProfileNavigationImpl
    ): ProfileNavigation
}

class TimeLineDetailNavigationImpl @Inject constructor() : TimeLineDetailNavigation {
    override fun go(context: Context, userId: Int) {
    }
}

@Module
@InstallIn(ActivityComponent::class)
abstract class TimeLineDetailNavigationInject {
    @Binds
    abstract fun bindTimeLineDetailNavigation(
        timeLineNavigationImpl: TimeLineDetailNavigationImpl
    ): TimeLineDetailNavigation
}

class ShareBottomSheetNavigationImpl @Inject constructor() : ShareBottomSheetNavigation {
    override fun show(context: Context) {
    }

    @Module
    @InstallIn(ActivityComponent::class)
    abstract class ShareBottomSheetNavigationModule {
        @Binds
        abstract fun go(
            shareBottomSheetNavigationImpl: ShareBottomSheetNavigationImpl
        ): ShareBottomSheetNavigation
    }
}

class TorangShareImpl @Inject constructor() : TorangShare {
    override fun shareLink(context: Context, url: String) {
    }
}

@Module
@InstallIn(ActivityComponent::class)
abstract class TorangShareModule {
    @Binds
    abstract fun provideTorangShare(torangShareImpl: TorangShareImpl): TorangShare
}

@Module
@InstallIn(ActivityComponent::class)
abstract class PicturePageNavigationModule {
    @Binds
    abstract fun providePicturePageNavigation(picturePageNavigationimpl: PicturePageNavigationImpl): PicturePageNavigation

}

class PicturePageNavigationImpl @Inject constructor() : PicturePageNavigation {
    override fun go(context: Context, reviewId: Int, position: Int) {
    }
}

class MyReviewNavigation @Inject constructor() : AddReviewNavigation {
    override fun go(context: Context, restaurantId: Int?, reviewId: Int) {
    }
}

@Module
@InstallIn(ActivityComponent::class)
abstract class MyReviewNavigationProvider {
    @Binds
    abstract fun provideAddReviewNavigation(myReviewNavigation: MyReviewNavigation): AddReviewNavigation
}

@Module
@InstallIn(ActivityComponent::class)
abstract class LoginNavigationModule {
    @Binds
    abstract fun provideLoginNavigation(loginNavigationImpl: LoginNavigationImpl): LoginNavigation
}

class LoginNavigationImpl @Inject constructor() : LoginNavigation {
    override fun goLogin(fragmentManager: FragmentManager?) {
    }

    override fun goLogin(context: Context) {
    }
}

class MenuBottomSheetNavigationImpl @Inject constructor() : MenuBottomSheetNavigation {

    var dialog: BottomSheetDialog? = null

    override fun show(
        context: Context,
        feedDialogEventAdapter: FeedDialogEventAdapter,
        feed: Feed
    ) {
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

class MyMenuBottomSheetNavigationImpl @Inject constructor() : MyMenuBottomSheetNavigation {

    var dialog: BottomSheetDialog? = null

    override fun show(
        context: Context,
        myDialogEventAdapter: FeedMyDialogEventAdapter,
        feed: Feed
    ) {
    }

    override fun dismiss() {
        dialog?.dismiss()
    }

    @Module
    @InstallIn(ActivityComponent::class)
    abstract class MyMenuBottomSheetNavigationModule {
        @Binds
        abstract fun go(
            menuBottomSheetNavigationImpl: MyMenuBottomSheetNavigationImpl
        ): MyMenuBottomSheetNavigation
    }
}

class NotLoggedInMenuBottomSheetNavigationImpl @Inject constructor() : NotLoggedInMenuBottomSheetNavigation {

    var dialog: BottomSheetDialog? = null

    override fun show(
        context: Context,
        myDialogEventAdapter: NotLoggedInFeedDialogEventAdapter,
        feed: Feed
    ) {
    }

    override fun dismiss() {
        dialog?.dismiss()
    }

    @Module
    @InstallIn(ActivityComponent::class)
    abstract class NotLoggedInMenuBottomSheetNavigationModule {
        @Binds
        abstract fun go(
            menuBottomSheetNavigationImpl: NotLoggedInMenuBottomSheetNavigationImpl
        ): NotLoggedInMenuBottomSheetNavigation
    }
}

class ReportNavigationImpl @Inject constructor() : ReportNavigation {
    override fun goReport(context: Context, reviewId: Int) {
    }
}

@Module
@InstallIn(ActivityComponent::class)
abstract class ReportModule {
    @Binds
    abstract fun provideReportNavigation(reportNavigationImpl: ReportNavigationImpl): ReportNavigation
}