package com.donato.news.services;

import com.donato.news.dto.newsapi.NewsApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsApiServiceImpl implements NewsApiService{

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${service.api.news.url}")
    private String apiUrl;

    @Value("${service.api.news.apikey}")
    private String apiKey ;

    @Override
    public NewsApi getNews(String search) {
        return restTemplate.getForEntity(apiUrl+"?q={search}&apiKey={apiKey}", NewsApi.class, search, apiKey).getBody();
    }

}
