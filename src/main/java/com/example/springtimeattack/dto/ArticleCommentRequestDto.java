package com.example.springtimeattack.dto;

import lombok.Getter;

@Getter
public class ArticleCommentRequestDto {
    private Long idx; // -> 정말 필요한가?
    private String comment;

}
