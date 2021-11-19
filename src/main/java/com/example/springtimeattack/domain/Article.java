package com.example.springtimeattack.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Article extends Timestamped {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String title;

    //반드시 값을 가져오도록 합니다.
    @Column(nullable = false)
    private String content;
}
