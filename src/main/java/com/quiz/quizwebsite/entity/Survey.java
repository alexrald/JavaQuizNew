package com.quiz.quizwebsite.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;

    @ManyToMany
    private List<Question> questions;  // several questions

    private LocalDateTime createTime;
    private String link;  // unique link, ID and a hash
    private int maxAge;
    private int minAge;
}
