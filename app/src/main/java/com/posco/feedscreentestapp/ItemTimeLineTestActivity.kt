package com.posco.feedscreentestapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.screen_feed.FeedPagerAdapter
import com.example.screen_feed.databinding.ItemTimeLineBinding
import com.example.screen_feed.usecase.ItemFeedBottomUsecase
import com.example.screen_feed.usecase.ItemFeedTopUseCase
import com.example.screen_feed.usecase.ItemTimeLineUseCase
import com.google.android.material.snackbar.Snackbar

class ItemTimeLineTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ItemTimeLineBinding>(
            this,
            com.example.screen_feed.R.layout.item_time_line
        )
        val adapter = FeedPagerAdapter().apply {
            setList(
                arrayListOf(
                    "https://thumb.mt.co.kr/06/2022/01/2022011414312292328_1.jpg/dims/optimize/",
                    "https://thumb.mt.co.kr/06/2022/01/2022011414312292328_1.jpg/dims/optimize/",
                    "https://thumb.mt.co.kr/06/2022/01/2022011414312292328_1.jpg/dims/optimize/"
                )
            )
        }

        binding.useCase = ItemTimeLineUseCase(
            itemFeedTopUseCase = ItemFeedTopUseCase(
                name = "sryang",
                restaurantName = "mcdonalds",
                rating = 4.5f,
                profilePictureUrl = "https://thumb.mt.co.kr/06/2022/01/2022011414312292328_1.jpg/dims/optimize/",
                onMenuClickListener = { snackBar(binding.root, "clickMenu") },
                onProfileImageClickListener = { snackBar(binding.root, "profileClick") },
                onNameClickListener = { snackBar(binding.root, "nameClick") },
                onRestaurantClickListener = { snackBar(binding.root, "restaurantClick") }
            ),
            itemFeedBottomUseCase = ItemFeedBottomUsecase(
                clickLikeListener = { snackBar(binding.root, "clickLike") },
                clickCommentListener = { snackBar(binding.root, "clickComment") },
                clickShareListener = { snackBar(binding.root, "clickshare") },
                clickFavoriteListener = { snackBar(binding.root, "clickFavorite") },
                likeAmount = 10,
                commentAmount = 20,
                author = "sryang",
                comment = "comment",
                isLike = true,
                isFavorite = true
            ),
            pageAdapter = adapter
        )
    }

    fun snackBar(view: View, text: String) {
        Snackbar.make(
            this, view, text, Snackbar.LENGTH_SHORT
        ).show()
    }
}