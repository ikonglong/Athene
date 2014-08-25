package com.quest.mapper;

import com.quest.model.*;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.HTML;
import java.util.List;

/**
 * Created by hongfeiyanghf on 14-8-25.
 */
public class QuestionManagerTest extends BaseTest {

    @Autowired
    private QuestionManager questionManager;

    @Autowired
    private TagManager tagManager;

    @Test
    public void testSubmitQestion() throws Exception {
//        Question question = new Question();
//        question.authorId = 1;
//        question.categoryId = 1;
//        question.content = "what is java about?";
//        question.state = "new";
//        question.tagId = 1;
//        question.noOfExposures = 0;
//        question.questionTitleId = 1;
//        questionManager.submitQestion(question);
        //! 先测试加一条记录到 表里，其实应该保存对象的时候 同时为其他表插入数据并做关联

        //! 构造一个问题
        Question question = new Question();

        //! 此时需要一个作者，所以构造一个会员
        User author = new User();
        author.userId = 1;
        question.authorId = author.userId;

        //! 此时需要一个类目，所以构造一个类目
        question.categoryId = 1;

        //! 填入问题具体内容
        question.content = "具体要怎么才能学好java?";
        question.state = "new";

        //! 如果问题有标签则插入一个标签
        String tag = "软件";
        QuestionTag questionTag = tagManager.findTagByTagContent(tag);

        if (questionTag == null){
            questionTag = new QuestionTag();
            questionTag.tagContent = tag;
            tagManager.submitTag(questionTag);
        }

        //! 刚保存的问题曝光率为0
        question.noOfExposures = 0;

        //! 问题的标题
        String title = "java 容易学吗？";
        QuestionTitle questionTitle = questionManager.findTitleByTitleContent(title);
        if (questionTitle == null) {
            questionTitle = new QuestionTitle();
            questionTitle.questionTitleContent = title;
            questionManager.saveQuestionTitle(questionTitle);
        }

        questionManager.submitQestion(question);
   }

    @Test
    public void  testFindQuestionTitleByFuzzyInput() throws Exception {

        String input = "软件";
        List<QuestionTitle> questionTitles = questionManager.findQuestionTitleByFuzzyInput(input);
        Assert.assertNotNull(questionTitles);
        Assert.assertSame(1,questionTitles.size());
        for (QuestionTitle t : questionTitles) {
            System.out.print(t.getQuestionTitleContent() + "=========" +t.getQuestionTitleId() );

        }
    }

    @Test
    public void testAddAnswerForQuestion() throws Exception {
        Answer answer = new Answer();
        answer.authorId = 1;
        answer.isAccepted = false;
        answer.questionId = 1;
        answer.answerContent = "java 是语言里最简单的！";
        answer.numOfComments = 0;
        questionManager.addAnswerForQuestion(answer);

    }

    @Test
    public void  testLookupCountOfAnswersByQuestionId()  throws Exception {

        int questionCount = questionManager.lookupCountOfAnswersByQuestionId(1);
        Assert.assertSame(2,questionCount);
    }
}
