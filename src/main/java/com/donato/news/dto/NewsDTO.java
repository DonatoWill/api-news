package com.donato.news.dto;

import com.donato.news.dto.newsapi.Article;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class NewsDTO {


    private String source;

    private String author;

    private String title;

    private String description;

    private String url;

    private String publishedAt;

    private String content;

    public static NewsDTO from(Article article) {

        return NewsDTO.builder()
                .source(article.getSource().getName())
                .author(article.getAuthor())
                .title(article.getTitle())
                .description(article.getDescription())
                .url(article.getUrl())
                .publishedAt(article.getPublishedAt())
                .content(article.getContent())
                .build();

    }


}
