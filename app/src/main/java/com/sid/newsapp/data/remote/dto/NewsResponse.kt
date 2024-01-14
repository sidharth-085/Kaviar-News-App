package com.sid.newsapp.data.remote.dto

import com.sid.newsapp.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)