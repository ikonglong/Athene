package com.quest.athene.domain.repository;

import com.quest.athene.domain.model.Question;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hongfeiyanghf on 14-8-31.
 */
//@Repository
public interface QuestionRepository {

    /**
     * 提交问题
     * @param question
     */
    public void submitQuestion(Question question);

    /**
     * 通过id查找问题
     * @param questionId
     * @return
     */
    public Question findQuestionById(long questionId);

    /**
     * 通过id 将问题删除
     * @param questionId
     * @return
     */
    public void removeQuestionById(long questionId);

    /**
     * 修正问题内容
     * @param question
     */
    public void fixQuestionContent(Question question);

    /**
     * 修正问题标题
     * @param question
     */
    public void fixQuestionTitle(Question question);

    /**
     * 通过作者ID查询问题
     * @param authorId
     * @return
     */
    public List<Question> findQuestionsByAuthorId(long authorId);
}
