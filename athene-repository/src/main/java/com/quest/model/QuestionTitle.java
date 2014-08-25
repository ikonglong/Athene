package com.quest.model;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public class QuestionTitle {

    //! 问题标题ID
    public long questionTitleId;

    //! 问题标题
    public String questionTitleContent;

    public long getQuestionTitleId() {
        return questionTitleId;
    }

    public void setQuestionTitleId(long questionTitleId) {
        this.questionTitleId = questionTitleId;
    }

    public String getQuestionTitleContent() {
        return questionTitleContent;
    }

    public void setQuestionTitleContent(String questionTitleContent) {
        this.questionTitleContent = questionTitleContent;
    }
}
