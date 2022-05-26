package com.donato.news.usecase;

import com.donato.news.dto.NewsDTO;
import com.donato.news.dto.newsapi.NewsApi;
import com.donato.news.services.NewsApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GetNewsUseCaseImpl implements GetNewsUseCase{

    @Autowired
    private NewsApiService newsApiService;

    @Override
    public List<NewsDTO> execute(String search) {

        NewsApi response = newsApiService.getNews(search);

        return response.getArticles()
                .stream()
                .map(NewsDTO::from)
                .collect(Collectors.toList());
    }
}
