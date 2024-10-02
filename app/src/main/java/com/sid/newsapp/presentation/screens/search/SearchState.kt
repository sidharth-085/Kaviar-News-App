package com.sid.newsapp.presentation.screens.search

import androidx.paging.PagingData
import com.sid.newsapp.domain.model.Article
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val searchQuery: String = "",
    val articles: Flow<PagingData<Article>>? = null
)