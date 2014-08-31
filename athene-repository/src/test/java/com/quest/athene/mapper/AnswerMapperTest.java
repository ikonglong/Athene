package com.quest.athene.mapper;

import com.quest.athene.domain.model.Answer;
import com.quest.athene.domain.model.Question;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

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

    @Test
    public void testUpdateCommentCountForAnswer() throws Exception {
        Answer answer = new Answer();
        answer.setAnswerId(1);
        answer.setModifierId(1);
        answer.setModifiedTime(new Date());
        answerMapper.updateCommentCountForAnswer(answer);
    }

    @Test
    public void testUpdateVoteCountForAnswer() throws Exception {
        Answer answer = new Answer();
        answer.setAnswerId(1);
        answer.setModifierId(1);
        answer.setModifiedTime(new Date());
        answerMapper.updateVoteCountForAnswer(answer);
    }

    @Test
    public void testUpdateContentByAnswerId() throws Exception {
        Answer answer = new Answer();
        answer.setAnswerId(1);
        answer.setAnswerContent("haha test!");
        answer.setModifiedTime(new Date());
        answer.setModifierId(1);
        answerMapper.updateContentByAnswerId(answer);

    }

    @Test
    public void testUpdateAnswerByAuthorAndQuestionId() throws Exception {

        Answer answer = new Answer();
        answer.setAnswerContent("hihi hello!");
        answer.setAccepted(false);
        answer.setAnswerId(1);
        answer.setModifiedTime(new Date());
        answer.setModifierId(1);
        answer.setQuestionId(1);
        answerMapper.updateAnswerByAuthorAndQuestionId(answer);
    }

    @Test
    public void testFindAnswerByAnswerId() throws Exception {
        Answer answer = answerMapper.findAnswerByAnswerId(1);
    }

    @Test
    public void testFindAnswersByAnswerContent() throws Exception {
        List<Answer> answer = answerMapper.findAnswersByAnswerContent("h");
    }

    @Test
    public void testFindAnswersByAuthorId() throws Exception {
        List<Answer> answers = answerMapper.findAnswersByAuthorId(1);
    }

    @Test
    public void testFindAnswersByQuestionId() throws Exception {
        Answer answer = answerMapper.findAnswerByAnswerId(1);
    }

}
