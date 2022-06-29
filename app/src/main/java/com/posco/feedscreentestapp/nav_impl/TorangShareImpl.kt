package com.posco.feedscreentestapp.nav_impl

import android.content.Context
import android.widget.Toast
import com.example.torang_core.navigation.TorangShare
import javax.inject.Inject

class TorangShareImpl @Inject constructor() : TorangShare {
    override fun shareLink(context: Context, url: String) {
        Toast.makeText(context, "TorangShare url=${url}", Toast.LENGTH_SHORT).show()
    }
}