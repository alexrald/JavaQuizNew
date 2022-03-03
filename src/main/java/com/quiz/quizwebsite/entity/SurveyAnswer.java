package com.quiz.quizwebsite.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SurveyAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Question question;

    @OneToOne(cascade = CascadeType.ALL)
    private Choice choice;

    private int score;
}
