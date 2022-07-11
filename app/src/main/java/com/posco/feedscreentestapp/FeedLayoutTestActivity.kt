package com.posco.feedscreentestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.screen_feed.usecase.FeedsFragmentLayoutUseCase
import com.example.screen_feed.databinding.FragmentFeedsBinding
import com.google.android.material.snackbar.Snackbar

class FeedLayoutTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<FragmentFeedsBinding>(
            this,
            com.example.screen_feed.R.layout.fragment_feeds
        )

        binding.useCase = FeedsFragmentLayoutUseCase(
            onRefreshListener = {
                Snackbar.make(binding.root, "갱신 클릭!", Toast.LENGTH_SHORT).show()
            },
            onMenuItemClickListener = {
                Snackbar.make(binding.root, "리뷰작성 클릭!", Toast.LENGTH_SHORT).show()
                false
            },
            adapter = TestAdapter(),
            reLoad = {
                Snackbar.make(binding.root, "갱신!", Toast.LENGTH_SHORT).show()
                binding.slTimeline.isRefreshing = false
            },
            visibleButton = true,
            isRefreshing = false
        )

    }

    class TestAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            return object : RecyclerView.ViewHolder(TextView(parent.context)) {

            }
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        }

        override fun getItemCount(): Int {
            return 10
        }

    }
}