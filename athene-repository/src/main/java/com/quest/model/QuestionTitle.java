package com.quest.model;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public class QuestionTitle {

    //! 问题标题ID
    public long questionTitleId;

    //! 问题标题
    public String questionContent;

    public long getQuestionTitleId() {
        return questionTitleId;
    }

    public void setQuestionTitleId(long questionTitleId) {
        this.questionTitleId = questionTitleId;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
