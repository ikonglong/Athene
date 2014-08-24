package com.quest.model;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public class Question {

    //! 问题ID
    public long questionId;

    //! 作者ID
    public long authorId;

    //! 问题标题
    public long questionTitleId;

    //! 问题详细内容
    public String content;

    //! 问题的状态
    public String state;

    //! 类目ID
    public long categoryId;

    //! 曝光次数
    public long noOfExposures;

    //! 问题所属标签ID
    public long tagId;

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    public long getNoOfExposures() {
        return noOfExposures;
    }

    public void setNoOfExposures(long noOfExposures) {
        this.noOfExposures = noOfExposures;
    }

    public long getQuestionTitleId() {
        return questionTitleId;
    }

    public void setQuestionTitleId(long questionTitleId) {
        this.questionTitleId = questionTitleId;
    }
}
