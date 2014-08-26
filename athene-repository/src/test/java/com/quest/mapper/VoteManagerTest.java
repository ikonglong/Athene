package com.quest.mapper;

import com.quest.model.Answer;
import com.quest.model.Vote;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2014/8/26.
 */
public class VoteManagerTest extends BaseTest {

    @Autowired
    private VoteManager voteManager;

    @Autowired
    private QuestionManager questionManager;

    @Test
    public void  testSaveVote() throws  Exception {

        Vote vote = new Vote();
        vote.setVoteId(1);
        vote.setVoteTargetId(1);
        voteManager.saveVote(vote);
    }

    @Test
    public void testVoteAnswer() throws Exception {

        //! 首先查看用户是否已经VOTE 过该答案
        Map<String,Integer> voteParamMap = new HashMap<String,Integer>();
        voteParamMap.put("voterId",1);
        voteParamMap.put("answerId",1);
        Vote userVote = voteManager.findAnswerByVoterIdAndAnswerId(voteParamMap);
        if (userVote == null) {

            //! 先保存一个投票
            Vote vote = new Vote();
            vote.setVoterId(1);
            vote.setVoteTargetId(1);
            voteManager.saveVote(vote);
            questionManager.updateVoteForAnswer(vote.getVoteTargetId());
        }

    }

    @Test
    public  void  findAnswerByVoterIdAndAnswerId() throws  Exception {
        //! 首先查看用户是否已经VOTE 过该答案
        Map<String,Integer> voteParamMap = new HashMap<String,Integer>();
        voteParamMap.put("voterId",1);
        voteParamMap.put("answerId",1);
        Vote userVote = voteManager.findAnswerByVoterIdAndAnswerId(voteParamMap);
        Assert.assertNull(userVote);
    }
}
