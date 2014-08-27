package com.quest.service;

import com.quest.mapper.QuestionManager;
import com.quest.mapper.VoteManager;
import com.quest.model.Vote;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hongfeiyanghf on 14-8-27.
 */
public class VoteService {

    @Autowired
    private VoteManager voteManager;

    @Autowired
    private QuestionManager questionManager;

    //! 1. 保存一个投票 2. 给答案加上投票数
    public void voteAnswer(long answerId, long userId){

        Map<String,Long> voteParamMap = new HashMap<String,Long>();
        voteParamMap.put("voterId", userId);
        voteParamMap.put("answerId",answerId);

        Vote userVote = voteManager.findVoteByVoterIdAndAnswerId(voteParamMap);
        if (userVote == null) {

            //! 先保存一个投票
            Vote vote = new Vote();
            vote.setVoterId(userId);
            vote.setVoteTargetId(answerId);
            voteManager.saveVote(vote);
            questionManager.updateVoteForAnswer(vote.getVoteTargetId());
        }

    }
}
