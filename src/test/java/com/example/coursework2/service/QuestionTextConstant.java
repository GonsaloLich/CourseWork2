package com.example.coursework2.service;


import com.example.coursework2.entity.Question;

import java.util.Collection;
import java.util.Set;

public class QuestionTextConstant {
    public static final Question QUESTION_1 = new Question("A1", "B1");
    public static final Question QUESTION_2 = new Question("A2", "B2");
    public static final Question QUESTION_3 = new Question("A3", "B3");
    public static final Question QUESTION_4 = new Question("A4", "B3");
    public static final Question QUESTION_5 = new Question("A5", "B4");

    public static final Collection<Question> MOCK_QUESTIONS = Set.of(
            QUESTION_1,
            QUESTION_2,
            QUESTION_3,
            QUESTION_4
    );
}
