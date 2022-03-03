package com.quiz.quizwebsite.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class AnsweredSurvey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String personName;
    private LocalDate dateOfBirth;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Survey survey;

    @ManyToMany
    private List<SurveyAnswer> surveyAnswerList;

    private int totalScore;
}
