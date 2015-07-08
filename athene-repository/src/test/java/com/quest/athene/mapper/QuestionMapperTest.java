package com.quest.athene.mapper;

import com.quest.athene.domain.model.Question;
import com.quest.athene.domain.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created by hongfeiyanghf on 14-8-25.
 */
public class QuestionMapperTest extends BaseTest {

    @Autowired
    private QuestionMapper questionMapper;

    @Test
    public void testSubmitQestion() throws Exception {// ok

        //! 构造一个问题
        Question question = new Question();

        //! 此时需要一个作者，所以构造一个会员
        User author = new User();
        author.setUserId(1);
        question.setAuthorId(author.getUserId());

        //! 此时需要一个类目，所以构造一个类目
        question.setCategoryId(1);

        //! 填入问题具体内容
        question.setContent("知呼的模式到底好不好？");
        question.setState("new");

        //! 刚保存的问题曝光率为0
        question.setNumOfExposures(0);

        //! 问题的标题
        String title = "现在问答到底以什么模式来做？";
        question.setQuestionTitle(title);
        question.setModifiedTime(new Date());
        question.setModifierId(1);
        question.setCreatedTime(new Date());
        question.setCreatorId(1);
        question.setIsDeleted("n");

        questionMapper.submitQestion(question);
    }

    @Test
    public void testFindQuestionsByQuestionTitle() throws Exception {
        List<Question> questions = questionMapper.findQuestionsByQuestionTitle("现在问答到底以什么模式来做？");
        System.out.println(questions.size());
    }

    @Test
    public void testFindQuestionsByQuestionContent() throws Exception {
        List<Question> questions = questionMapper.findQuestionsByQuestionContent("java");
        System.out.println(questions.size());

    }

    @Test
    public void testFixQuestion() throws Exception {
        Question question = new Question();
        question.setModifiedTime(new Date());
        question.setCreatorId(1);
        question.setContent("hihi test1");
        question.setQuestionTitle("hihi test1");
        question.setState("verified");
        question.setQuestionId(1);
        questionMapper.fixQuestion(question);
    }

    @Test
    public void testUpdateAnswerCountByQuestionId() throws Exception {
        Question question = new Question();
        question.setQuestionId(1);
        question.setModifiedTime(new Date());
        question.setModifierId(1);
        questionMapper.updateAnswerCountByQuestionId(question);
    }

    @Test
    public void testUpdateCommentCountByQuestionId() throws Exception {

        Question question = new Question();
        question.setQuestionId(1);
        question.setModifiedTime(new Date());
        question.setModifierId(1);
        questionMapper.updateCommentCountByQuestionId(question);
    }

    @Test
    public void testUpdateExposureCountByQuestionId() throws Exception {

        Question question = new Question();
        question.setQuestionId(1);
        question.setModifiedTime(new Date());
        question.setModifierId(1);
        questionMapper.updateExposureCountByQuestionId(question);
    }

    @Test
    public void testFindQuestions() throws Exception {

        Question question = new Question();
//        question.setQuestionId(2);
        question.setState("new");
        questionMapper.findQuestions(question);
    }

    @Test
    public void testFindQuestionsByCategoryId() throws Exception {
        questionMapper.findQuestionsByCategoryId(1);

    }

    @Test
    public void testFindQuestionsByState() throws Exception {
        questionMapper.findQuestionsByState("new");
    }

    @Test
    public void testFindQuestionsByAuthorId() throws Exception {
        questionMapper.findQuestionsByAuthorId(1);

    }

    @Test
    public void testFindQuestionByQuestionId() throws Exception {
        questionMapper.findQuestionByQuestionId(1);
    }

    @Test
    public void testLookupCountOfAnswersByQuestionId() throws Exception {

        questionMapper.lookupCountOfAnswersByQuestionId(1);
    }
}
