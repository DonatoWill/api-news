package com.donato.news.usecase;

import com.donato.news.dto.NewsDTO;

import java.util.List;

public interface GetNewsUseCase {

    List<NewsDTO> execute(String search);

}
