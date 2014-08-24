package com.quest.mapper;

import com.quest.model.Question;
import com.quest.model.Tester;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hongfeiyanghf on 14-8-25.
 */
public class QuestionManagerTest extends BaseTest {

    @Autowired
    private QuestionManager questionManager;

    @Test
    public void testSubmitQestion() throws Exception {
        Question question = new Question();
        question.authorId = 1;
        question.categoryId = 1;
        question.content = "what is java about?";
        question.state = "new";
        question.tagId = 1;
        question.noOfExposures = 0;
        question.questionTitleId = 1;
        questionManager.submitQestion(question);
    }
}
