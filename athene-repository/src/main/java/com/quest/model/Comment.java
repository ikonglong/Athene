package com.quest.model;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public class Comment {

    //! 评论ID
    public long commentId;

    //! 评论目标
    public long targetId;

    //! 评论内容
    public String content;

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
