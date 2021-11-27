package com.example.springtimeattack.dto;

import lombok.Getter;

@Getter
public class ArticleCommentRequestDto {
    private Long idx; // 게시글 idx
    private String comment;

}
