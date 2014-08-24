package com.quest.model;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public class Answer {

    //! 答案ID
    public long answerId;

    //! 答案提交者
    public String author;

    //! 答案是否被采纳
    public boolean isAccepted;

    public long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(long answerId) {
        this.answerId = answerId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }
}
