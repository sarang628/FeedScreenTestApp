package com.posco.feedscreentestapp.di.repositories

import androidx.lifecycle.LiveData
import com.example.torang_core.data.model.*
import com.example.torang_core.data.remote.RemoteFeed
import com.example.torang_core.repository.FeedRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class FeedRepositoryModule {
    @Binds
    abstract fun provideFeedRepository(feedRepository: FeedRepositoryImpl): FeedRepository
}

@Singleton
class FeedRepositoryImpl @Inject constructor() : FeedRepository {
    override suspend fun deleteFeed(reviewId: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun loadFeed(): ArrayList<RemoteFeed> {
        return ArrayList<RemoteFeed>().apply {
            add(RemoteFeed(1))
            add(RemoteFeed(2))
            add(RemoteFeed(3))
            add(RemoteFeed(4))
            add(RemoteFeed(5))
        }
    }
}