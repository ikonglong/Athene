package com.quest.mapper;

import com.quest.athene.domain.model.Answer;
import com.quest.athene.domain.model.Question;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by hongfeiyanghf on 14-8-31.
 */
public class AnswerMapperTest extends BaseTest {

    @Autowired
    private AnswerMapper answerMapper;

    @Autowired
    private QuestionMapper questionMapper;

    @Test
    public void testAddAnswerForQuestion() throws Exception {//ok
        Answer answer = new Answer();
        answer.setQuestionId(1);
        answer.setModifierId(1);
        answer.setModifiedTime(new Date());
        answer.setAccepted(true);
        answer.setAnswerContent("hihi test");
        answer.setNumOfComments(0);
        answer.setNumOfVotes(0);
        answer.setCreatorId(1);
        answer.setCreatedTime(new Date());
        answer.setAuthorId(1);
        answer.setIsDeleted("n");
        answerMapper.addAnswerForQuestion(answer);
        Question question = questionMapper.findQuestionByQuestionId(1);
        questionMapper.updateAnswerCountByQuestionId(question);
    }
}
