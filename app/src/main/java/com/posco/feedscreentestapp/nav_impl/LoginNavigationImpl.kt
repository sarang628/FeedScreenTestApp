package com.posco.feedscreentestapp.nav_impl

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.example.torang_core.navigation.LoginNavigation
import javax.inject.Inject

class LoginNavigationImpl @Inject constructor() : LoginNavigation {
    override fun goLogin(fragmentManager: FragmentManager?) {
    }

    override fun goLogin(context: Context) {
        Toast.makeText(context, "goLogin", Toast.LENGTH_SHORT).show()
    }
}