package com.quest.athene.domain.repository;

import com.quest.athene.domain.model.Question;

/**
 * Created by hongfeiyanghf on 14-8-31.
 */
public interface QuestionRepository {

    /**
     * 提交问题
     * @param question
     */
    public void submitQuestion(Question question);
}
