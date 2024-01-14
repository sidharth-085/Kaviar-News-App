package com.sid.newsapp.presentation.bookmark

import com.sid.newsapp.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)