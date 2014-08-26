package com.quest.mapper;

import com.quest.model.Vote;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Created by Administrator on 2014/8/26.
 */
public interface VoteManager {

    //! 1. 保存一个投票 2. 给答案加上投票数
    public void voteAnswer(long answerId);

    public void saveVote(Vote vote);

    //! 根据投票人ID 获取问题
    public Vote findAnswerByVoterIdAndAnswerId(@Param(value="vote") Map<String,Integer> voteParamMap);

}
