package com.quest.athene.mapper;

import com.quest.athene.domain.model.Comment;
import org.apache.ibatis.annotations.Param;


public interface CommentMapper {

    public void insert(Comment comment);

    public Comment findById(@Param("id")long id);

}
