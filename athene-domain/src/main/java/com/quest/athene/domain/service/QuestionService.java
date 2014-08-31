package com.quest.athene.domain.service;

import com.quest.athene.domain.model.Question;
import com.quest.athene.domain.model.User;
import com.quest.athene.domain.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by hongfeiyanghf on 14-8-31.
 */
@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public void submitQuestion(Question question) {
        questionRepository.submitQuestion(question);
    }

    public Question findQuestionById(long questionId) {
        return questionRepository.findQuestionById(questionId);
    }

    public void fixQuestionContentById(String content, long questionId, User user) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setContent(content);
        question.setModifierId(user.getUserId());
        question.setModifiedTime(new Date());
        questionRepository.fixQuestionContent(question);
    }

    public void fixQuestionTitleById(String title, long questionId, User user) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setQuestionTitle(title);
        question.setModifiedTime(new Date());
        question.setModifierId(user.getUserId());
        questionRepository.fixQuestionTitle(question);
    }

    public void removeQuestionById(long questionId) {
        questionRepository.removeQuestionById(questionId);
    }

    public void findQuestionsByAuthorId(long questionId){
        questionRepository.findQuestionsByAuthorId(questionId);

    }
}
