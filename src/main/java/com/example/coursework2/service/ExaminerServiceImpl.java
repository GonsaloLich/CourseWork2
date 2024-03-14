package com.example.coursework2.service;

import com.example.coursework2.entity.Question;
import com.example.coursework2.exceptions.IncorrectQuestAmountException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService{
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) { this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if( amount <= 0 || amount > questionService.getAll().size()){
            throw new IncorrectQuestAmountException();
        }
        Set<Question> questions = new HashSet<>();
        while (questions.size() < amount){
            questions.add(questionService.getRandomQuestion());
        }
        return questions;
    }
}
