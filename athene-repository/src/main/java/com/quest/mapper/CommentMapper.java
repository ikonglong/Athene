package com.quest.mapper;

import com.quest.athene.domain.model.Comment;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public interface CommentMapper {

    /**
     * 添加一个评论
     * @param comment 评论
     */
    public void submitComment (Comment comment);

}
