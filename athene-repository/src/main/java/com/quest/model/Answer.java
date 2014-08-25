package com.quest.model;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public class Answer {

    //! 答案ID
    public long answerId;

    //! 答案提交者
    public long authorId;

    //! 答案是否被采纳
    public boolean isAccepted;

    //! 答案所对应的问题
    public long questionId;

    //! 答案内容
    public String answerContent;

    //! 被评论数
    public int numOfComments;

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public int getNumOfComments() {
        return numOfComments;
    }

    public void setNumOfComments(int numOfComments) {
        this.numOfComments = numOfComments;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(long answerId) {
        this.answerId = answerId;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }
}
