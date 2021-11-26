package com.example.springtimeattack.domain;

import com.example.springtimeattack.dto.ArticleCommentRequestDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Comment extends Timestamped{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idx;

    @Column(nullable = false)
    private String comment;

    @JsonIgnore // Article에서 더 이상 Comment를 조회하지 않게 -> 순환참조 방지
    @ManyToOne
    @JoinColumn(name = "article_idx", nullable = false)
    private Article article;

    public Comment(ArticleCommentRequestDto requestDto, Article article) {
        this.comment = requestDto.getComment();
        this.article = article;
    }
}
