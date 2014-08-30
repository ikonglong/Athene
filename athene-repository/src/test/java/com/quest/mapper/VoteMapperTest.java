package com.quest.mapper;

import com.quest.athene.domain.model.Vote;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2014/8/26.
 */
public class VoteMapperTest extends BaseTest {

    @Autowired
    private VoteMapper voteManager;

    @Autowired
    private QuestionMapper questionManager;

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
        Map<String,Long> voteParamMap = new HashMap<String,Long>();
        voteParamMap.put("voterId",1L);
        voteParamMap.put("answerId",1L);
        Vote userVote = voteManager.findVoteByVoterIdAndAnswerId(voteParamMap);
        if (userVote == null) {

            //! 先保存一个投票
            Vote vote = new Vote();
            vote.setVoterId(1);
            vote.setVoteTargetId(1);
            voteManager.saveVote(vote);
//            questionManager.updateVoteForAnswer(vote.getVoteTargetId());
        }

    }

    @Test
    public void findAnswerByVoterIdAndAnswerId() throws  Exception {
        //! 首先查看用户是否已经VOTE 过该答案
        Map<String,Long> voteParamMap = new HashMap<String,Long>();
        voteParamMap.put("voterId",1L);
        voteParamMap.put("answerId",1L);
        Vote userVote = voteManager.findVoteByVoterIdAndAnswerId(voteParamMap);
        Assert.assertNull(userVote);
    }
}
