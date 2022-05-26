package com.donato.news.controller;

import com.donato.news.dto.NewsDTO;
import com.donato.news.usecase.GetNewsUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private GetNewsUseCase getNewsUseCase;

    @GetMapping
    ResponseEntity<List<NewsDTO>> getNews(@RequestParam String search){
        return ResponseEntity.ok(getNewsUseCase.execute(search));
    }

}
