package com.quest.mapper;

import com.quest.athene.domain.model.Answer;
import com.quest.athene.domain.model.Vote;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/8/26.
 */
public class VoteMapperTest extends BaseTest {

    @Autowired
    private VoteMapper voteMapper;

    @Autowired
    private AnswerMapper answerMapper;

    @Test
    public void  testSaveVote() throws  Exception {

        Vote vote = new Vote();
        vote.setVoteId(1);
        vote.setVoteTargetId(1);
        voteMapper.saveVote(vote);
    }

    @Test
    public void testVoteAnswer() throws Exception {

        Answer answer = answerMapper.findAnswerByAnswerId(1L);

        //! 首先查看用户是否已经VOTE 过该答案
        Map<String,Long> voteParamMap = new HashMap<String,Long>();
        voteParamMap.put("voterId",1L);
        voteParamMap.put("answerId",1L);
        Vote userVote = voteMapper.findVoteByVoterIdAndAnswerId(voteParamMap);
        if (userVote == null) {

            //! 先保存一个投票
            Vote vote = new Vote();
            vote.setVoterId(1);
            vote.setVoteTargetId(1);
            voteMapper.saveVote(vote);
            answerMapper.updateVoteCountForAnswer(answer);
        }

    }

    @Test
    public void testFindAnswerByVoterIdAndAnswerId() throws  Exception {
        //! 首先查看用户是否已经VOTE 过该答案
        Map<String,Long> voteParamMap = new HashMap<String,Long>();
        voteParamMap.put("voterId",1L);
        voteParamMap.put("answerId",1L);
        Vote userVote = voteMapper.findVoteByVoterIdAndAnswerId(voteParamMap);
        Assert.assertNull(userVote);
    }

    @Test
    public void testFindVotesByVoterId() throws Exception {
        List<Vote> votes = voteMapper.findVotesByVoterId(1);
    }

    @Test
    public void testFindVotesByAnswerId() throws Exception {
        List<Vote> votes = voteMapper.findVotesByAnswerId(1);
    }

    @Test
    public void testDeleteVoteByVoterId() throws Exception {
        Vote vote = new Vote();
        vote.setVoterId(1);
        vote.setModifierId(1);
        vote.setModifiedTime(new Date());
        voteMapper.deleteVoteByVoterId(vote);

    }

    @Test
    public void testDeleteVoteByVoteId() throws Exception {
        Vote vote = new Vote();
        vote.setVoterId(1);
        vote.setModifiedTime(new Date());
        vote.setModifierId(1);
        voteMapper.deleteVoteByVoterId(vote);
    }

    @Test
    public void testDeleteVoteByTargetId() throws Exception {

        Vote vote = new Vote();
        vote.setVoteTargetId(1);
        vote.setModifiedTime(new Date());
        vote.setModifierId(1);
        voteMapper.deleteVoteByTargetId(vote);
    }
}
