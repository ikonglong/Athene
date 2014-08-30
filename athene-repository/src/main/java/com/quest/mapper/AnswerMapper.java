package com.quest.mapper;

import com.quest.athene.domain.model.Answer;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * Created by hongfeiyanghf on 14-8-30.
 */
public interface AnswerMapper {

    /**
     * 为问题添加一个答案
     * @param answer
     */
    public void addAnswerForQuestion(Answer answer);

    /**
     * 根据答案ID查询答案
     * @param answerId
     * @return
     */
    public Answer findAnswerByAnswerId(long answerId);

    /**
     * 根据答案内容模糊查找问题
     * @param answerContent
     * @return
     */
    public List<Answer> findAnswersByAnswerContent(String answerContent);

    /**
     * 根据回答者ID查找答案
     * @param authorId
     * @return
     */
    public List<Answer> findAnswersByAuthorId(long authorId);

    /**
     * 根据问题ID查找答案
     * @param questionId
     * @return
     */
    public List<Answer> findAnswersByQuestionId(long questionId);

    /**
     * 根据问题ID 更新投票数
     * @param answerId
     */
    public void updateVoteCountForAnswer(long answerId);

    /**
     * 根据答案ID 修改答案的评论数
     * @param answerId
     */
    public void updateCommentCountForAnswer(long answerId);

    /**
     * 根据答案ID更新答案内容
     * @param answerId
     */
    public void updateContentByAnswerId(long answerId);

    /**
     * 根据作者ID和问题ID更新问题
     * @param param
     */
    public void updateAnswerByAuthorAndQuestionId(@Param(value="answerParam") HashMap<String,Long> param);

    /**
     * 根据答案ID删除答案
     * @param answerId
     */
    public void deleteAnswerByAnswerId(long answerId);

    /**
     * 根据问题ID删除答案
     * @param answerId
     */
    public void deleteAnswerByQuestionId(long answerId);

    /**
     * 根据作者ID删除答案
     * @param authorId
     */
    public void deleteAnswerByAuthorId(long authorId);

}
