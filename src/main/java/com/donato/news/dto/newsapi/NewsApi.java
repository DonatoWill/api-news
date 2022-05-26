package com.donato.news.dto.newsapi;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class NewsApi {
    private String status;
    private Long totalResults;
    private List<Article> articles;
}
