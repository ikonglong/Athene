package com.quest.mapper;

import com.quest.model.Question;
import com.quest.model.QuestionTitle;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public interface QuestionManager {

    public void submitQestion (Question question);

    public Question findQuestionByAuthor(String author);
//
//    public Question findQuestionByTag (String tag) {
//
//
//    }
//
//    public Question findQuestionByTitle (String title) {
//
//
//    }
//
//    public Question findQuestionByTagId (String tagId) {
//
//
//    }
//
//    public Question findQuestionByState (String state) {
//
//
//    }
//
    public QuestionTitle findTitleByTitleContent (String titleContent) ;

//
    public void saveQuestionTitle(QuestionTitle title);
}
