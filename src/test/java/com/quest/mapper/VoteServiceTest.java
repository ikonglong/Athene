package com.quest.mapper;

import com.quest.athene.domain.service.VoteService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hongfeiyanghf on 14-8-27.
 */
public class VoteServiceTest extends BaseTest {

    @Autowired
    private VoteMapper voteManager;

    @Autowired
    private QuestionMapper questionManager;

    @Autowired
    private VoteService voteService;

    @Test
    public void testVoteAnswer() throws Exception {

//            voteService.voteAnswer(2,1);

    }
}
