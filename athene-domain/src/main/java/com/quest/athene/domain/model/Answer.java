package com.quest.athene.domain.model;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public class Answer extends BaseEntity {

    /**
     * 答案ID
     */
    private long answerId;

    /**
     * 答案提交者
     */
    private long authorId;

    /**
     * 答案是否被采纳
     */
    private boolean isAccepted;

    /**
     * 答案所对应的问题
     */
    private long questionId;

    /**
     * 答案内容
     */
    private String answerContent;

    /**
     * 被评论数
     */
    private int numOfComments;

    /**
     * 被赞的次数
     */
    private int numOfVotes;

    public long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(long answerId) {
        this.answerId = answerId;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public int getNumOfComments() {
        return numOfComments;
    }

    public void setNumOfComments(int numOfComments) {
        this.numOfComments = numOfComments;
    }

    public int getNumOfVotes() {
        return numOfVotes;
    }

    public void setNumOfVotes(int numOfVotes) {
        this.numOfVotes = numOfVotes;
    }
}
