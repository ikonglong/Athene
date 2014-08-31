package com.quest.athene.domain.service;


/**
 * Created by hongfeiyanghf on 14-8-27.
 */
public class VoteService {

    /*@Autowired
    private VoteMapper voteManager;

    @Autowired
    private QuestionMapper questionManager;

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
            vote.setVoteObjectId(answerId);
            voteManager.saveVote(vote);
            questionManager.updateVoteForAnswer(vote.getVoteObjectId());
        }

    }*/
}
