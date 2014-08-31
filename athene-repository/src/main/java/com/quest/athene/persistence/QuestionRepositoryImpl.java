package com.quest.athene.persistence;

import com.quest.athene.domain.model.Question;
import com.quest.athene.domain.repository.QuestionRepository;
import com.quest.athene.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hongfeiyanghf on 14-8-31.
 */
@Repository("questionRepository")
public class QuestionRepositoryImpl implements QuestionRepository {

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public void removeQuestionById(long questionId) {
        questionMapper.deleteQuestionByQuestionId(questionId);
    }

    @Override
    public void submitQuestion(Question question) {
        questionMapper.submitQestion(question);
    }

    @Override
    public void fixQuestionContent(Question question) {
        questionMapper.fixQuestion(question);
    }

    @Override
    public void fixQuestionTitle(Question question) {
        questionMapper.fixQuestion(question);
    }

    @Override
    public Question findQuestionById(long questionId) {
        return questionMapper.findQuestionByQuestionId(questionId);
    }

    @Override
    public List<Question> findQuestionsByAuthorId(long authorId) {
        return questionMapper.findQuestionsByAuthorId(authorId);
    }
}
