package com.donato.news.services;

import com.donato.news.dto.newsapi.NewsApi;

public interface NewsApiService {

    NewsApi getNews(String search);

}
