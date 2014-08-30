package com.quest.athene.domain.model;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public class QuestionTitle {

    //! 问题标题ID
    private long questionTitleId;

    //! 问题标题
    private String questionTitleContent;

    //! 标题对应的问题
    private long questionId;

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

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
