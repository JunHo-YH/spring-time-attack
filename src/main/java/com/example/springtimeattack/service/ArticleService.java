package com.example.springtimeattack.service;

import com.example.springtimeattack.domain.Article;
import com.example.springtimeattack.domain.Comment;
import com.example.springtimeattack.dto.ArticleCommentRequestDto;
import com.example.springtimeattack.dto.ArticleRequestDto;
import com.example.springtimeattack.repository.ArticleRepository;
import com.example.springtimeattack.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;
    private final CommentRepository commentRepository;

    // 게시글 조회
    public List<Article> getArticles() {
        return articleRepository.findAll();
    }

    // 게시글 생성
    public Article setArticle(ArticleRequestDto articleRequestDto) {
        Article article = new Article(articleRequestDto);
        articleRepository.save(article);
        return article;
    }

    // 특정 게시글 조회
    public Article getArticle(Long id) {
        return articleRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("존재하지 않는 게시글입니다.")
        );
    }

    // 게시글에 댓글 등록
    public void setArticleComment(ArticleCommentRequestDto articleCommentRequestDto) {
        Article article = articleRepository.findById(articleCommentRequestDto.getIdx()).orElseThrow(
                () -> new NullPointerException("해다 아이디가 존재하지 않습니다.")
        );

        Comment comment = new Comment(articleCommentRequestDto, article);
        commentRepository.save(comment);
    }


}
