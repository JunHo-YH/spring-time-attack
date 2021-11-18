package com.example.springtimeattack.service;

import com.example.springtimeattack.domain.Article;
import com.example.springtimeattack.dto.ArticleRequestDto;
import com.example.springtimeattack.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AritcleService {

    private final ArticleRepository articleRepository;

    public Article setArticle(ArticleRequestDto articleRequestDto) {
        Article article = new Article();
        article.setContent(articleRequestDto.getContent());
        articleRepository.save(article);
        return article;
    }

    public Article getArticle(Long id) {
        return articleRepository.findById(id).get();
    }

}
