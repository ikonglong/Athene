package com.quest.com.quest.athene.repository.impl;

import com.quest.athene.domain.model.Question;
import com.quest.athene.domain.repository.QuestionRepository;
import com.quest.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hongfeiyanghf on 14-8-31.
 */
public class QuestionRepositoryImpl implements QuestionRepository {

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public void submitQuestion(Question question) {
        questionMapper.submitQestion(question);
    }
}
