package com.example.springtimeattack.repository;

import com.example.springtimeattack.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
