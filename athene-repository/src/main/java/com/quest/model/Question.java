package com.quest.model;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public class Question {

    //! 问题ID
    private long questionId;

    //! 作者ID
    private long authorId;

    //! 问题标题
    private long questionTitleId;

    //! 问题详细内容
    private String content;

    //! 问题的状态
    private String state;

    //! 类目ID
    private long categoryId;

    //! 曝光次数
    private long numOfExposures;

    //! 评论次数
    private long numOfComments;

    //! 问题所属标签ID
    private long tagId;

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

    public long getNumOfExposures() {
        return numOfExposures;
    }

    public void setNumOfExposures(long numOfExposures) {
        this.numOfExposures = numOfExposures;
    }

    public long getQuestionTitleId() {
        return questionTitleId;
    }

    public void setQuestionTitleId(long questionTitleId) {
        this.questionTitleId = questionTitleId;
    }
}
