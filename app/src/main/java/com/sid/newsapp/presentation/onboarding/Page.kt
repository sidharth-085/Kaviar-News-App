package com.sid.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.sid.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Welcome to Kaviar",
        description = "Embark on a journey of curated news with Kaviar – your go-to source for insightful updates.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "News Redefined",
        description = "Experience news like never before with Kaviar, where excellence meets every headline.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Kaviar: Your News Companion",
        description = "Elevate your news experience with Kaviar – empowering you to stay ahead and stay informed.",
        image = R.drawable.onboarding3
    )
)