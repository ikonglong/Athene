package com.quest.model;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public class Comment {

    //! 评论ID
    private long commentId;

    //! 评论目标
    private long targetId;

    //! 评论内容
    private String content;

    //! 被评论数
    private int numOfComments;

    private int targetType;

    public int getTargetType() {
        return targetType;
    }

    public void setTargetType(int targetType) {
        this.targetType = targetType;
    }

    public int getNumOfComments() {
        return numOfComments;
    }

    public void setNumOfComments(int numOfComments) {
        this.numOfComments = numOfComments;
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public long getTargetId() {
        return targetId;
    }

    public void setTargetId(long targetId) {
        this.targetId = targetId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
