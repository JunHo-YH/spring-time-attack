package com.example.springtimeattack.controller;

import com.example.springtimeattack.domain.Article;
import com.example.springtimeattack.dto.ArticleRequestDto;
import com.example.springtimeattack.service.AritcleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ArticleController {

    private final AritcleService articleService;

    @PostMapping("/article")
    public Article setArticle(@RequestBody ArticleRequestDto articleRequestDto) {
        return articleService.setArticle(articleRequestDto);
    }

    @GetMapping("/article/{id}")
    public Article getArticle(@PathVariable Long id) {
        return articleService.getArticle(id);
    }

    @GetMapping("/article")
    public List<Article> getArticleAll() {
        return articleService.getArticleAll();
    }
}
