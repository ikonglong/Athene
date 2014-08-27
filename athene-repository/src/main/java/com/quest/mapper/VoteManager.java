package com.quest.mapper;

import com.quest.model.Vote;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Created by Administrator on 2014/8/26.
 */
public interface VoteManager {

    public void saveVote(Vote vote);

    //! 根据投票人ID 获取投票
    public Vote findVoteByVoterIdAndAnswerId(@Param(value="vote") Map<String,Long> voteParamMap);

}
