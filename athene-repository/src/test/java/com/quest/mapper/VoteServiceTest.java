package com.quest.mapper;

import com.quest.service.VoteService;
import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hongfeiyanghf on 14-8-27.
 */
public class VoteServiceTest extends BaseTest {

    @Autowired
    private VoteManager voteManager;

    @Autowired
    private QuestionManager questionManager;

    @Autowired
    private VoteService voteService;

    @Test
    public void testVoteAnswer() throws Exception {

            voteService.voteAnswer(2,1);

    }
}
