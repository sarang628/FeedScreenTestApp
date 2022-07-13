package com.posco.feedscreentestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
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
        binding.useCase = ItemTimeLineUseCase(
            itemFeedTopUseCase = ItemFeedTopUseCase(
                name = "sryang",
                restaurantName = "mcdonalds",
                rating = 4.5f,
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
            pageAdapter = FeedPagerAdapter()
        )
    }

    fun snackBar(view: View, text: String) {
        Snackbar.make(
            this, view, text, Snackbar.LENGTH_SHORT
        ).show()
    }
}

class FeedPagerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return FeedPageHolder(
            LayoutInflater.from(parent.context)
                .inflate(com.example.screen_feed.R.layout.item_feed_page, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }

}

class FeedPageHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}