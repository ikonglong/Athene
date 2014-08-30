package com.quest.athene.domain.model;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public class Question extends BaseEntity {

    /**
     * 问题ID
     */
    private long questionId;

    /**
     * 作者ID
     */
    private long authorId;

    /**
     * 问题标题
     */
    private String questionTitle;

    /**
     * 问题详细内容
     */
    private String content;

    /**
     * 问题的状态
     */
    private String state;

    /**
     * 类目ID
     */
    private long categoryId;

    /**
     * 曝光次数
     */
    private long numOfExposures;

    /**
     * 评论次数
     */
    private long numOfComments;

    /**
     * 答案数
     */
    private long numOfAnswers;

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

    public long getNumOfAnswers() {
        return numOfAnswers;
    }

    public void setNumOfAnswers(long numOfAnswers) {
        this.numOfAnswers = numOfAnswers;
    }

    public long getNumOfExposures() {
        return numOfExposures;
    }

    public void setNumOfExposures(long numOfExposures) {
        this.numOfExposures = numOfExposures;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public long getNumOfComments() {
        return numOfComments;
    }

    public void setNumOfComments(long numOfComments) {
        this.numOfComments = numOfComments;
    }
}
