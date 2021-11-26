package com.example.springtimeattack.controller;

import com.example.springtimeattack.domain.Article;
import com.example.springtimeattack.dto.ArticleCommentRequestDto;
import com.example.springtimeattack.dto.ArticleRequestDto;
import com.example.springtimeattack.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    // 조회
    @GetMapping("/articles")
    public List<Article> getArticles() {
        return articleService.getArticles();
    }

    // 게시글 생성
    @PostMapping("/article")
    public Article setArticle(@RequestBody ArticleRequestDto articleRequestDto) {
        return articleService.setArticle(articleRequestDto);
    }

    // 특정 게시글 조회
    @GetMapping("/article/{id})")
    public Article getArticle(@PathVariable Long id) {
        return articleService.getArticle(id);
    }

    // 게시글에 댓글 생성
    @PostMapping("/article/comment")
    public void setArticleComment(@RequestBody ArticleCommentRequestDto articleCommentRequestDto) {
        articleService.setArticleComment(articleCommentRequestDto);
    }
}
