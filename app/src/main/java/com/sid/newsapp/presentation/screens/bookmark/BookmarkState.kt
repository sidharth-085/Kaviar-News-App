package com.sid.newsapp.presentation.screens.bookmark

import com.sid.newsapp.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)