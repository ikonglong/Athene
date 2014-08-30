package com.quest.athene.domain.model;

import com.google.common.base.Preconditions;

import java.util.Date;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public class Comment extends BaseEntity {

    /**
     * 评论ID
     */
    private long id;

    /**
     * 评论目标
     */
    private long targetId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 被评论数
     */
    private int numOfComments;

    /**
     * 目标类型
     */
    private int targetType;

    public Comment() {}

    public Comment(String content, User commenter) {
        super(commenter);
        this.content = content;
    }

    /**
     * 回复指定的评论
     * @param commentId
     */
    public void replyToComment(long commentId) {
        this.setTargetId(commentId);
    }

    /**
     * 评论指定的问题
     * @param questionId
     */
    public void commentOnQuestion(long questionId) {
        this.setTargetId(questionId);
    }

    /**
     * 评论指定的解答
     * @param answerId
     */
    public void commentOnAnswer(long answerId) {
        this.setTargetId(answerId);
    }

    /**
     * 删除当前用户的当前评论
     */
    public void remove(User operator) {
        Preconditions.checkState((this.id > 0), "id <= 0");
        if (this.getCreatorId() != operator.getUserId()) {
            throw new UnsupportedOperationException("Can't remove others' comment");
        }

        this.setIsDeleted(YesOrNo.YES.val());
        this.setModifierId(operator.getUserId());
        this.setModifiedTime(new Date());
    }

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
