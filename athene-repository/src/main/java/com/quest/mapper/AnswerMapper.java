package com.quest.mapper;

import com.quest.athene.domain.model.Answer;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;

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
