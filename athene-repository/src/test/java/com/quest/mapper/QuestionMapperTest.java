package com.quest.mapper;

import com.quest.athene.domain.model.*;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hongfeiyanghf on 14-8-25.
 */
public class QuestionMapperTest extends BaseTest {

    @Autowired
    private QuestionMapper questionManager;

    @Autowired
    private TagMapper tagManager;

    @Test
    public void testSubmitQestion() throws Exception {

        //! 构造一个问题
        Question question = new Question();

        //! 此时需要一个作者，所以构造一个会员
        User author = new User();
        author.setUserId(1);
        question.setAuthorId(author.getUserId());

        //! 此时需要一个类目，所以构造一个类目
        question.setCategoryId(1);

        //! 填入问题具体内容
        question.setContent("具体要怎么才能学好java?");
        question.setState("new");

        //! 如果问题有标签则插入一个标签
        String tag = "软件";
        QuestionTag questionTag = tagManager.findTagByTagContent(tag);

        if (questionTag == null){
            questionTag = new QuestionTag();
            questionTag.setTagContent(tag);
            tagManager.submitTag(questionTag);
        }

        //! 刚保存的问题曝光率为0
        question.setNumOfExposures(0);

        //! 问题的标题
        String title = "java 容易学吗？";
       /* QuestionTitle questionTitle = questionManager.findTitleByTitleContent(title);
        if (questionTitle == null) {
            questionTitle = new QuestionTitle();
            questionTitle.setQuestionTitleContent(title);
            questionManager.saveQuestionTitle(questionTitle);
        }*/

        questionManager.submitQestion(question);
   }

    @Test
    public void  testFindQuestionTitleByFuzzyInput() throws Exception {

        /*String input = "软件";
        List<QuestionTitle> questionTitles = questionManager.findQuestionTitleByFuzzyInput(input);
        Assert.assertNotNull(questionTitles);
        Assert.assertSame(1,questionTitles.size());
        for (QuestionTitle t : questionTitles) {
            System.out.print(t.getQuestionTitleContent() + "=========" +t.getQuestionTitleId() );

        }*/
    }

    @Test
    public void testAddAnswerForQuestion() throws Exception {
        Answer answer = new Answer();
        answer.setAuthorId(1);
        answer.setAccepted(false);
        answer.setQuestionId(1);
        answer.setAnswerContent( "java 是语言里最简单的！");
        answer.setNumOfComments(0);
        questionManager.addAnswerForQuestion(answer);

    }

    @Test
    public void  testLookupCountOfAnswersByQuestionId()  throws Exception {

        int questionCount = questionManager.lookupCountOfAnswersByQuestionId(1);
        Assert.assertSame(2,questionCount);
    }

    @Test
    public void testFixQuestion() throws  Exception {

        Question question = new Question();
        question.setQuestionId(1);
        question.setContent("JAVA学习道路的正确体系结构是什么，比如先学什么，后学什么？");
        questionManager.fixQuestion(question);
    }
}
