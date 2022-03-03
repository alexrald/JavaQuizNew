package com.quiz.quizwebsite.entity;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;

    @OneToMany
    private List<Question> questionList;

    private LocalDateTime createDateTime;

    private LocalDateTime expirationDate;

    private String link;
}
