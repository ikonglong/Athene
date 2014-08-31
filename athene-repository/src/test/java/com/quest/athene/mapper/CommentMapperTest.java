package com.quest.athene.mapper;

import com.quest.athene.domain.model.Comment;
import com.quest.athene.domain.model.User;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class CommentMapperTest extends BaseTest {

    @Autowired
    private CommentMapper commentMapper;

    @Test
    public void insert() throws Exception {
        User commenter = new User();
        commenter.setUserId(1);
        commenter.setUsername("Jack");
        String content = "问题范围太大，根本没办法回答";

        Comment comment = new Comment(content, commenter);
        comment.setObjectId(1);
        comment.setObjectType(3); // 评论目标
        comment.setNumOfComments(0);
        commentMapper.insert(comment);
    }

    @Test
    public void findById() {
        Comment comment = commentMapper.findById(2);
        assertNotNull(comment);
        assertEquals(2, comment.getId());
    }

}
