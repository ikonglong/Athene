package com.quest.athene.mapper;


import com.quest.athene.domain.model.Question;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public interface QuestionMapper {

    /**
     * 提交一个问题
     * @param question 问题
     */
    public void submitQestion (Question question);

    /**
     * 纠正一个问题
     * @param question 问题
     */
    public void fixQuestion(Question question);

    /**
     * 根据问题ID更新答案数
     * @param question
     */
    public void updateAnswerCountByQuestionId(Question question);

    /**
     * 根据问题ID更新评论数
     * @param question
     */
    public void updateCommentCountByQuestionId(Question question);

    /**
     * 根据问题ID更新曝光数
     * @param question
     */
    public void updateExposureCountByQuestionId(Question question);

    /**
     * 模糊查找问题
     * @param input 输入
     */
    public List<Question> findQuestionsByQuestionContent(String input);

    /**
     * 根据标题查找问题
     * @param title
     * @return
     */
    public List<Question> findQuestionsByQuestionTitle(String title);

    /**
     * 根据类目ID查询问题
     * @param categoryId
     * @return
     */
    public List<Question> findQuestionsByCategoryId(long categoryId);

    /**
     * 根据状态查询问题
     * @param state
     * @return
     */
    public List<Question> findQuestionsByState(String state);

    /**
     * 根据提问者ID查询问题
     * @param authorId
     * @return
     */
    public List<Question> findQuestionsByAuthorId(long authorId);

    /**
     * 查找问题有多少个答案，在联想问题标题的时候 需要显示
     * @param questionId 问题id
     */
    public int lookupCountOfAnswersByQuestionId(long questionId);

    /**
     * 根据问题ID查询问题
     * @param questionId
     * @return
     */
    public Question findQuestionByQuestionId(long questionId);

    /**
     * 根据问题的参数查找问题
     * @param question
     * @return
     */
    public List<Question> findQuestions(Question question);

    /**
     * 根据问题ID删除问题
     * @param questionId
     */
    public void deleteQuestionByQuestionId(long questionId);

    /**
     * 根据提问者ID删除问题
     * @param authorId
     */
    public void deleteQuestionsByAuthorId(long authorId);

    /**
     * 根据类目ID删除问题
     * @param categoryId
     */
    public void deleteQuestionsByCategoryId(long categoryId);

    /**
     * 根据问题标题删除问题
     * @param questionTitle
     */
    public void deleteQuestionByQuestionTitle(String questionTitle);

}
