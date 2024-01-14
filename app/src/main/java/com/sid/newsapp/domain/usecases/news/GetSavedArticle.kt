package com.sid.newsapp.domain.usecases.news

import com.sid.newsapp.data.local.NewsDao
import com.sid.newsapp.domain.model.Article
import javax.inject.Inject

class GetSavedArticle @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(url: String): Article?{
        return newsDao.getArticle(url = url)
    }

}